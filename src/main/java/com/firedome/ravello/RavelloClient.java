package com.firedome.ravello;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.firedome.ravello.exception.RavelloException;
import com.firedome.ravello.model.*;
import com.firedome.ravello.model.application.ApplicationAspects;
import com.firedome.ravello.model.application.network.service.dhcpserver.RavelloDhcpServer;
import com.firedome.ravello.model.application.network.service.dnsserver.RavelloDnsServer;
import com.firedome.ravello.model.application.network.service.router.RavelloRouter;
import com.firedome.ravello.model.application.network.service.networkinterface.RavelloNetworkInterface;
import com.firedome.ravello.model.application.network.subnet.RavelloSubnet;
import com.firedome.ravello.model.application.network.switches.RavelloSwitch;
import com.firedome.ravello.model.application.network.switches.port.RavelloPort;
import com.firedome.ravello.model.auxiliary.*;
import com.firedome.ravello.model.blueprint.RavelloLocations;
import com.firedome.ravello.model.common.vm.RavelloVm;
import com.firedome.ravello.model.common.vm.RavelloVms;
import com.firedome.ravello.model.common.vm.networkconnection.ipconfig.RavelloIpConfig;
import com.firedome.ravello.payload.CreateApplicationPayload;
import com.firedome.ravello.payload.CreateBlueprintPayload;
import com.firedome.ravello.payload.CreateImagePayload;
import com.firedome.ravello.payload.PublishApplicationPayload;
import com.firedome.ravello.payload.network.*;
import com.firedome.ravello.payload.vm.AddVmPayload;
import com.firedome.ravello.payload.vm.VmActionTypes;
import com.firedome.ravello.payload.vm.VmsActionPayload;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * How to use:
 * 1. Construct RavelloConfig, passing username and password: RavelloConfig config = new RavelloConfig("username", "passord");
 * 2. Construct RavelloClient, passing config: RavelloClient client = new RavelloClient(config);
 * 3. Use one of the following methods: client.getApplications, client.getApplications, client.startApplication, client.stopApplication, client.restartApplication
 */
public class RavelloClient {

    private static final String APPLICATIONS_URL = "https://cloud.ravellosystems.com/api/v1/applications";
    private static final String APPLICATION_URL = APPLICATIONS_URL + "/%d";
    private static final String IS_APPLICATION_PUBLISHED_URL = APPLICATIONS_URL + "/%d" + "/isPublished";
    private static final String PUBLISH_APPLICATION_URL = APPLICATION_URL + "/publish";
    private static final String CREATE_APPLICATION_URL = APPLICATIONS_URL;
    private static final String START_APPLICATION_URL = APPLICATION_URL + "/start";
    private static final String STOP_APPLICATION_URL = APPLICATION_URL + "/stop";
    private static final String RESTART_APPLICATION_URL = APPLICATION_URL + "/restart";
    private static final String SET_APPLICATION_EXPIRATION_TIME_URL = APPLICATION_URL + "/setExpiration";
    private static final String PUBLISH_APPLICATION_UPDATES = APPLICATION_URL + "/publishUpdates?startAllDraftVms=" + "%s";
    private static final String VM_IN_APPLICATION_URL = APPLICATION_URL + "/vms" + "/%d";
    private static final String DEPLOYED_VM_FQDN_URL = APPLICATION_URL + "/vms" + "/%d" + "/fqdn;deployment";
    private static final String DEPLOYED_VM_CLOUD_STATE_URL = APPLICATION_URL + "/vms" + "/%d" + "/state;deployment";
    private static final String DEPLOYED_VM_PUBLIC_IPS_URL = APPLICATION_URL + "/vms" + "/%d" + "/publicIps;deployment";
    private static final String UPDATE_VM_URL = APPLICATION_URL + "/vms" + "/%d";
    private static final String APPLICATION_VMS_URL = APPLICATION_URL + "/vms";
    private static final String APPLICATION_VM_URL = APPLICATION_URL + "/vms" + "/%d";
    private static final String ADD_VM_TO_APPLICATION_URL = APPLICATION_URL + "/vms";
    private static final String EXECUTE_MULTIPLE_VMS_ACTION_IN_APPLICATION_URL = APPLICATION_VMS_URL + "/%s";
    private static final String EXECUTE_SINGLE_VM_ACTION_IN_APPLICATION_URL = VM_IN_APPLICATION_URL + "/%s";
    private static final String APPLICATION_NETWORK_URL = APPLICATION_URL + "/network";

    private static final String APPLICATION_SUBNETS_URL = APPLICATION_NETWORK_URL + "/subnets";
    private static final String APPLICATION_SUBNETS_ASPECT_URL = APPLICATION_SUBNETS_URL + "%s";
    private static final String APPLICATION_SUBNET_URL = APPLICATION_SUBNETS_URL + "/%d" + "%s";
    private static final String APPLICATION_SUBNETS_IN_DESIGN_URL = APPLICATION_SUBNETS_URL + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_SUBNET_IN_DESIGN_URL = APPLICATION_SUBNETS_URL + "/%d" + ApplicationAspects.DESIGN.toString();

    private static final String APPLICATION_SWITCHES_URL = APPLICATION_NETWORK_URL + "/switches";
    private static final String APPLICATION_SWITCHES_ASPECT_URL = APPLICATION_SWITCHES_URL + "%s";
    private static final String APPLICATION_SWITCH_URL = APPLICATION_SWITCHES_URL + "/%d" + "%s";
    private static final String APPLICATION_SWITCHES_IN_DESIGN_URL = APPLICATION_SWITCHES_URL + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_SWITCH_IN_DESIGN_URL = APPLICATION_SWITCHES_URL + "/%d" + ApplicationAspects.DESIGN.toString();

    private static final String SWITCH_URL = APPLICATION_SWITCHES_URL + "/%d" + "/ports";
    private static final String APPLICATION_SWITCH_PORTS_URL = SWITCH_URL + "%s";
    private static final String APPLICATION_SWITCH_PORT_URL = SWITCH_URL + "/%d" + "%s";
    private static final String APPLICATION_SWITCH_PORT_IN_DESIGN_URL = SWITCH_URL + "/%d" + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_SWITCH_PORTS_IN_DESIGN_URL = SWITCH_URL + ApplicationAspects.DESIGN.toString();

    private static final String APPLICATION_SERVICES_URL = APPLICATION_NETWORK_URL + "/services";
    private static final String APPLICATION_ROUTERS_URL = APPLICATION_SERVICES_URL + "/routers";
    private static final String APPLICATION_ROUTERS_ASPECT_URL = APPLICATION_ROUTERS_URL + "%s";
    private static final String APPLICATION_ROUTER_URL = APPLICATION_ROUTERS_URL + "/%d" + "%s";
    private static final String APPLICATION_ROUTERS_IN_DESIGN_URL = APPLICATION_ROUTERS_URL + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_ROUTER_IN_DESIGN_URL = APPLICATION_ROUTERS_URL + "/%d" + ApplicationAspects.DESIGN.toString();

    private static final String APPLICATION_DNS_SERVERS_URL = APPLICATION_SERVICES_URL + "/dnsServers";
    private static final String APPLICATION_DNS_SERVERS_ASPECT_URL = APPLICATION_DNS_SERVERS_URL + "%s";
    private static final String APPLICATION_DNS_SERVER_URL = APPLICATION_DNS_SERVERS_URL + "/%d" + "%s";
    private static final String APPLICATION_DNS_SERVERS_IN_DESIGN_URL = APPLICATION_DNS_SERVERS_URL + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_DNS_SERVER_IN_DESIGN_URL = APPLICATION_DNS_SERVERS_URL + "/%d" + ApplicationAspects.DESIGN.toString();

    private static final String APPLICATION_DHCP_SERVERS_URL = APPLICATION_SERVICES_URL + "/dhcpServers";
    private static final String APPLICATION_DHCP_SERVERS_ASPECT_URL = APPLICATION_DHCP_SERVERS_URL + "%s";
    private static final String APPLICATION_DHCP_SERVER_URL = APPLICATION_DHCP_SERVERS_URL + "/%d" + "%s";
    private static final String APPLICATION_DHCP_SERVERS_IN_DESIGN_URL = APPLICATION_DHCP_SERVERS_URL + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_DHCP_SERVER_IN_DESIGN_URL = APPLICATION_DHCP_SERVERS_URL + "/%d" + ApplicationAspects.DESIGN.toString();

    private static final String APPLICATION_NETWORK_INTERFACES_URL = APPLICATION_NETWORK_URL + "/services/networkInterfaces";
    private static final String APPLICATION_NETWORK_INTERFACES_ASPECT_URL = APPLICATION_NETWORK_INTERFACES_URL + "%s";
    private static final String APPLICATION_NETWORK_INTERFACE_ASPECT_URL = APPLICATION_NETWORK_INTERFACES_URL + "/%d" + "%s";
    private static final String APPLICATION_NETWORK_INTERFACES_IN_DESIGN_URL = APPLICATION_NETWORK_INTERFACES_URL + ApplicationAspects.DESIGN.toString();
    private static final String APPLICATION_NETWORK_INTERFACE_IN_DESIGN_URL = APPLICATION_NETWORK_INTERFACES_URL + "/%d" + ApplicationAspects.DESIGN.toString();

    private static final String BLUEPRINTS_URL = "https://cloud.ravellosystems.com/api/v1/blueprints";
    private static final String BLUEPRINT_URL = BLUEPRINTS_URL + "/%d";
    private static final String CREATE_BLUEPRINT_URL = BLUEPRINTS_URL;
    private static final String BLUEPRINT_PUBLISH_LOCATIONS_URL = BLUEPRINT_URL + "/publishLocations";

    private static final String IMAGES_URL = "https://cloud.ravellosystems.com/api/v1/images";
    private static final String IMAGE_URL = IMAGES_URL + "/%d";

    private static final String USER_URL = "https://cloud.ravellosystems.com/api/v1/user";

    private static final String HEADER_NAME = "Accept";
    private static final String ERROR_MESSAGE_HEADER_KEY = "ERROR-MESSAGE";
    private static final String ERROR_CODE_HEADER_KEY = "ERROR-CODE";


    private ObjectMapper mapper = new ObjectMapper();

    private RavelloConfig config;
    private Client client;

    public RavelloClient(RavelloConfig config) {
        this.config = config;
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(new Authenticator(config.getUsername(), config.getPassword())).register(MyMessageBodyReader.class).register(MyMessageBodyWriter.class);
        this.client = ClientBuilder.newClient(clientConfig);
    }


    /*****************************************************/
    /********************Applications*********************/
    /*****************************************************/


    /**
     * Get Applications list
     *
     * @return all applications
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-applications-list></a>
     */
    public RavelloApplications getApplications() {
        return this.get(RavelloApplications.class, APPLICATIONS_URL);
    }

    /**
     * Get Application by id
     *
     * @param applicationId
     * @return application by the specified id
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-application"></a>
     */
    public RavelloApplication getApplication(long applicationId) {
        return this.get(RavelloApplication.class, APPLICATION_URL, applicationId);
    }

    /**
     * Create Application
     *
     * @param createRavelloApplicationPayload object representing request body
     * @return created application
     * @see CreateApplicationPayload
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-application"></a>
     */
    public RavelloApplication createApplication(CreateApplicationPayload createRavelloApplicationPayload) {
        return this.post(RavelloApplication.class, createRavelloApplicationPayload, CREATE_APPLICATION_URL);
    }

    /**
     * Update the specific Application.
     *
     * @param application            object representing request body
     * @param applicationId
     * @return updated Application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-application"></a>
     */
    public RavelloApplication updateApplication(RavelloApplication application, long applicationId) {
        return this.put(RavelloApplication.class, application, APPLICATION_URL, applicationId);
    }

    /**
     * Delete Application by id
     *
     * @param applicationId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-application"></a>
     */
    public void deleteApplication(long applicationId) {
        this.delete(APPLICATION_URL, applicationId);
    }

    /**
     * Publish Application to the cloud
     *
     * @param publishApplicationPayload object representing request body
     * @param applicationId
     * @see PublishApplicationPayload
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#publish-application"></a>
     */
    public void publishApplication(PublishApplicationPayload publishApplicationPayload, long applicationId) {
        this.post(publishApplicationPayload, PUBLISH_APPLICATION_URL, applicationId);
    }

    /**
     * Updates the cloud according to the current Application data.
     *
     * @param applicationId
     * @param startAllDraftVms When set to False, newly added draft VMs will not start after publish updates action.
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-application-action"></a>
     */
    public void publishUpdatesApplication(long applicationId, boolean startAllDraftVms) {
        //TODO: implement updateApplication method and then test this method
        this.post(null, PUBLISH_APPLICATION_UPDATES, applicationId, String.valueOf(startAllDraftVms));
    }

    /**
     * Starts all the Application VMs
     *
     * @param applicationId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-application-action"></a>
     */
    public void startApplication(long applicationId) {
        this.post(null, START_APPLICATION_URL, applicationId);
    }

    /**
     * Stops all the Application VMs
     *
     * @param applicationId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-application-action"></a>
     */
    public void stopApplication(long applicationId) {
        this.post(null, STOP_APPLICATION_URL, applicationId);
    }

    /**
     * Restarts all the Application VMs
     *
     * @param applicationId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-application-action"></a>
     */
    public void restartApplication(long applicationId) {
        this.post(null, RESTART_APPLICATION_URL, applicationId);
    }

    /**
     * Get Vms list from Application
     *
     * @param applicationId
     * @return Vms list in the application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-vms-list"></a>
     */
    public RavelloVms getVms(long applicationId) {
        return this.get(RavelloVms.class, APPLICATION_VMS_URL, applicationId);
    }

    /**
     * Get VM from Application
     *
     * @param applicationId
     * @param vmId
     * @return Returns a specific VM in the application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-vm"></a>
     */
    public RavelloVm getVm(long applicationId, long vmId) {
        return this.get(RavelloVm.class, APPLICATION_VM_URL, applicationId, vmId);
    }

    /**
     * Update a specific VM in the Application.
     * Usually used after getting VM by id {@link com.firedome.ravello.RavelloClient#getVm(long, long)}
     *
     * @param vm            object representing request body
     * @param applicationId
     * @param vmId
     * @return updated Application
     * @link package.com.firedome.ravello.model.common.vm.RavelloVm
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-vm"></a>
     */
    public RavelloApplication updateVm(RavelloVm vm, long applicationId, long vmId) {
        return this.put(RavelloApplication.class, vm, UPDATE_VM_URL, applicationId, vmId);
    }

    /**
     * Performs an action on a list of VMs in a published application.
     *
     * @param applicationId
     * @param payload       object representing request body
     * @see VmsActionPayload
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-multiple-vms-action"></a>
     */
    public void executeMultipleVmsActionInApplication(long applicationId, VmsActionPayload payload) {
        this.post(payload, EXECUTE_MULTIPLE_VMS_ACTION_IN_APPLICATION_URL, applicationId, payload.getActionType().toString());
    }

    /**
     * Performs an action on a specific VM in a published application.
     *
     * @param applicationId
     * @param vmId
     * @param actionType
     * @see VmActionTypes
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#execute-single-vm-action"></a>
     */
    public void executeSingleVmActionInApplication(long applicationId, long vmId, VmActionTypes actionType) {
        this.post(null, EXECUTE_SINGLE_VM_ACTION_IN_APPLICATION_URL, applicationId, vmId, actionType.toString());
    }

    /**
     * Set Application expiration time
     *
     * @param applicationId
     * @param seconds       The time (from now) when the application will be stopped.
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#set-application-expiration-time"></a>
     */
    public void setExpirationTime(long applicationId, Long seconds) {
        HashMap<String, Long> expirationFromNowSeconds = new HashMap<>();
        expirationFromNowSeconds.put("expirationFromNowSeconds", seconds);

        Response response = client.target(String.format(SET_APPLICATION_EXPIRATION_TIME_URL, applicationId)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).post(Entity.json(expirationFromNowSeconds));
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
    }

    /**
     * Add a new VM to the Application
     *
     * @param addVmPayload  object representing request body
     * @param applicationId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#add-vm-to-application-design"></a>
     */
    public void addVmToApplication(AddVmPayload addVmPayload, long applicationId) {
        this.post(addVmPayload, ADD_VM_TO_APPLICATION_URL, applicationId);
    }

    /**
     * Delete VM from the Application
     *
     * @param applicationId
     * @param vmId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-vm-from-application-design"></a>
     */
    public void deleteVmFromApplication(long applicationId, long vmId) {
        this.delete(VM_IN_APPLICATION_URL, applicationId, vmId);
    }

    /**
     * Get FQDN String of Deployed VM
     *
     * @param applicationId
     * @param vmId
     * @return FQDN string of a deployed VM
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-fqdn-string-of-deployed-vm"></a>
     */
    public RavelloFQDN getFQDNOfDeployedVm(long applicationId, long vmId) {
        return this.get(RavelloFQDN.class, DEPLOYED_VM_FQDN_URL, applicationId, vmId);
    }

    /**
     * Get the state of a deployed VM
     *
     * @param applicationId
     * @param vmId
     * @return state of a deployed VM
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-cloud-state-of-deployed-vm"></a>
     */
    public String getCloudStateOfDeployedVm(long applicationId, long vmId) {
        return this.get(String.class, DEPLOYED_VM_CLOUD_STATE_URL, applicationId, vmId);
    }

    /**
     * Get List of Public IPs of Deployed VM
     *
     * @param applicationId
     * @param vmId
     * @return public IPs of Deployed VM
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-list-of-public-ips-of-deployed-vm"></a>
     */
    public RavelloPublicIps getPublicIPsOfDeployedVm(long applicationId, long vmId) {
        return this.get(RavelloPublicIps.class, DEPLOYED_VM_PUBLIC_IPS_URL, applicationId, vmId);
    }

    /**
     * Check If Application is Published or Not
     *
     * @param applicationId
     * @return value specifying whether the application is published on the cloud
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#check-if-application-is-published-or-not"></a>
     */
    public RavelloApplicationPublishMarker checkIfApplicationIsPublished(long applicationId) {
        return this.get(RavelloApplicationPublishMarker.class, IS_APPLICATION_PUBLISHED_URL, applicationId);
    }

    /**
     * Get subnets
     *
     * @param applicationId
     * @param aspect
     * @return subnets
     * @see ApplicationAspects
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-subnets-list"></a>
     */
    public RavelloSubnets getSubnets(long applicationId, ApplicationAspects aspect) {
        return this.get(RavelloSubnets.class, APPLICATION_SUBNETS_ASPECT_URL, applicationId, aspect.toString());
    }

    /**
     * Get subnet from the application
     *
     * @param applicationId
     * @param subnetId
     * @return the subnet from application design’s network
     * @see ApplicationAspects
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-subnet"></a>
     */
    public RavelloSubnet getSubnet(long applicationId, long subnetId, ApplicationAspects aspect) {
        return this.get(RavelloSubnet.class, APPLICATION_SUBNET_URL, applicationId, subnetId, aspect.toString());
    }

    /**
     * Create a new subnet
     *
     * @param createSubnetPayload object representing request body
     * @param applicationId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-subnet"></a>
     */
    public RavelloApplication createSubnet(CreateSubnetPayload createSubnetPayload, long applicationId) {
        return this.post(RavelloApplication.class, createSubnetPayload,APPLICATION_SUBNETS_IN_DESIGN_URL, applicationId);
    }

    /**
     * Update a specific subnet
     *
     * @param updateSubnetPayload object representing request body
     * @param applicationId
     * @param subnetId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-subnet"></a>
     */
    public RavelloApplication updateSubnet(UpdateSubnetPayload updateSubnetPayload, long applicationId, long subnetId) {
        return this.put(RavelloApplication.class, updateSubnetPayload, APPLICATION_SUBNET_IN_DESIGN_URL, applicationId, subnetId);
    }

    /**
     * Delete subnet
     *
     * @param applicationId
     * @param subnetId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-subnet"></a>
     */
    public RavelloApplication deleteSubnet(long applicationId, long subnetId) {
        return this.delete(RavelloApplication.class, APPLICATION_SUBNET_IN_DESIGN_URL, applicationId, subnetId);
    }

    /**
     * Get switches
     *
     * @param applicationId
     * @param aspect
     * @return the application network switches
     * @see ApplicationAspects
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-switches-list"></a>
     */
    public RavelloSwitches getSwitches(long applicationId, ApplicationAspects aspect) {
        return this.get(RavelloSwitches.class, APPLICATION_SWITCHES_ASPECT_URL, applicationId, aspect.toString());
    }

    /**
     * Get switch
     *
     * @param applicationId
     * @param switchId
     * @param aspect
     * @see ApplicationAspects
     * @return the switch from application deployment’s network
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-switch"></a>
     */
    public RavelloSwitch getSwitch (long applicationId, long switchId, ApplicationAspects aspect) {
        return this.get(RavelloSwitch.class, APPLICATION_SWITCH_URL, applicationId, switchId, aspect.toString());
    }

    /**
     * Create switch
     *
     * @param ravelloSwitch object representing request body
     * @param applicationId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-switch"></a>
     */
    public RavelloApplication createSwitch (RavelloSwitch ravelloSwitch, long applicationId) {
        return this.post(RavelloApplication.class, ravelloSwitch, APPLICATION_SWITCHES_IN_DESIGN_URL, applicationId);
    }

    /**
     * Update a specific switch
     *
     * @param ravelloSwitch object representing request body
     * @param applicationId
     * @param switchId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-switch"></a>
     */
    public RavelloApplication updateSwitch (RavelloSwitch ravelloSwitch, long applicationId, long switchId) {
        return this.put(RavelloApplication.class, ravelloSwitch, APPLICATION_SWITCH_IN_DESIGN_URL, applicationId, switchId);
    }

    /**
     * Delete a specific switch
     *
     * @param applicationId
     * @param switchId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-switch"></a>
     */
    public RavelloApplication deleteSwitch (long applicationId, long switchId) {
        return this.delete(RavelloApplication.class, APPLICATION_SWITCH_IN_DESIGN_URL, applicationId, switchId);
    }

    /**
     * Get ports
     *
     * @param applicationId
     * @param switchId
     * @param aspect
     * @see ApplicationAspects
     * @return a list of all the ports within a certain switch
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-ports-list"></a>
     */
    public RavelloPorts getPorts (long applicationId, long switchId, ApplicationAspects aspect) {
        return this.get(RavelloPorts.class, APPLICATION_SWITCH_PORTS_URL, applicationId, switchId, aspect.toString());
    }

    /**
     * Get a specific port within a specific switch
     *
     * @param applicationId
     * @param switchId
     * @param portId
     * @param aspect
     * @see ApplicationAspects
     * @return requested port
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-port"></a>
     */
    public RavelloPort getPort(long applicationId, long switchId, long portId, ApplicationAspects aspect) {
        return this.get(RavelloPort.class, APPLICATION_SWITCH_PORT_URL, applicationId, switchId, portId, aspect.toString());
    }

    /**
     * Create port
     *
     * @param createPortPayload object representing request body
     * @see CreatePortPayload
     * @param applicationId
     * @param switchId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-port"></a>
     */
    public RavelloApplication createPort(CreatePortPayload createPortPayload, long applicationId, long switchId) {
        return this.post(RavelloApplication.class, createPortPayload, APPLICATION_SWITCH_PORTS_IN_DESIGN_URL, applicationId, switchId);
    }

    /**
     * Update port
     *
     * @param ravelloPort
     * @param applicationId
     * @param switchId
     * @param portId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-port"></a>
     */
    public RavelloApplication updatePort(RavelloPort ravelloPort, long applicationId, long switchId, long portId) {
        return this.put(RavelloApplication.class, ravelloPort, APPLICATION_SWITCH_PORT_IN_DESIGN_URL, applicationId, switchId, portId);
    }

    /**
     * Delete port
     *
     * @param applicationId
     * @param switchId
     * @param portId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-port"></a>
     */
    public RavelloApplication deletePort(long applicationId, long switchId, long portId) {
        return this.delete(RavelloApplication.class, APPLICATION_SWITCH_PORT_IN_DESIGN_URL, applicationId, switchId, portId);
    }

    /**
     * Get routers
     *
     * @param applicationId
     * @return the list of routers
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-routers-list"></a>
     */
    public RavelloRouters getRouters(long applicationId, ApplicationAspects aspect) {
        return this.get(RavelloRouters.class, APPLICATION_ROUTERS_ASPECT_URL, applicationId, aspect.toString());
    }

    /**
     * Get router
     *
     * @param applicationId
     * @param routerId
     * @param aspect
     * @see ApplicationAspects
     * @return requested router
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-route"r></a>
     */
    public RavelloRouter getRouter(long applicationId, long routerId, ApplicationAspects aspect) {
        return this.get(RavelloRouter.class, APPLICATION_ROUTER_URL, applicationId, routerId, aspect.toString());
    }

    /**
     * Create router
     *
     * @param createRouterPayload object representing request body
     * @see CreateRouterPayload
     * @param applicationId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-router"></a>
     */
    public RavelloApplication createRouter(CreateRouterPayload createRouterPayload, long applicationId) {
        return this.post(RavelloApplication.class, createRouterPayload, APPLICATION_ROUTERS_IN_DESIGN_URL, applicationId);
    }

    /**
     * Update router
     *
     * @param router object representing request body
     * @see RavelloRouter
     * @param applicationId
     * @param routerId
     * @return the full application
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#update-router"></a>
     */
    public RavelloApplication updateRouter(RavelloRouter router, long applicationId, long routerId) {
        return this.put(RavelloApplication.class, router, APPLICATION_ROUTER_IN_DESIGN_URL, applicationId, routerId);
    }

    /**
     * Delete router
     *
     * @param applicationId
     * @param routerId
     * @return the full application
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#delete-router"></a>
     */
    public RavelloApplication deleteRouter(long applicationId, long routerId) {
        return this.delete(RavelloApplication.class, APPLICATION_ROUTER_IN_DESIGN_URL, applicationId, routerId);
    }

    /**
     * Get DNS servers
     *
     * @param applicationId
     * @param aspect
     * @see ApplicationAspects
     * @return DNS servers
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#get-dns-servers-list"></a>
     */
    public RavelloDnsServers getDnsServers(long applicationId, ApplicationAspects aspect) {
        return this.get(RavelloDnsServers.class, APPLICATION_DNS_SERVERS_ASPECT_URL, applicationId, aspect.toString());
    }

    /**
     * Get DNS server
     *
     * @param applicationId
     * @param dnsServerId
     * @param aspect
     * @see ApplicationAspects
     * @return  requested DNS server
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#get-dns-server"></a>
     */
    public RavelloDnsServer getDnsServer (long applicationId, long dnsServerId, ApplicationAspects aspect) {
        return this.get(RavelloDnsServer.class, APPLICATION_DNS_SERVER_URL, applicationId, dnsServerId, aspect.toString());
    }

    /**
     * Create DNS server
     *
     * @param createDnsServerPayload object representing request body
     * @see CreateDnsServerPayload
     * @param applicationId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-dns-server"></a>
     */
    public RavelloApplication createDnsServer(CreateDnsServerPayload createDnsServerPayload, long applicationId) {
        return this.post(RavelloApplication.class, createDnsServerPayload, APPLICATION_DNS_SERVERS_IN_DESIGN_URL, applicationId);
    }

    /**
     * Update DNS Server
     *
     * @param dnsServer object representing request body
     * @param applicationId
     * @param dnsServerId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-dns-server"></a>
     */
    public RavelloApplication updateDnsServer(RavelloDnsServer dnsServer, long applicationId, long dnsServerId) {
        return this.put(RavelloApplication.class, dnsServer, APPLICATION_DNS_SERVER_IN_DESIGN_URL, applicationId, dnsServerId);
    }

    /**
     * Delete DNS server
     *
     * @param applicationId
     * @param dnsServerId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-dns-server"></a>
     */
    public RavelloApplication deleteDnsServer(long applicationId, long dnsServerId) {
        return this.delete(RavelloApplication.class, APPLICATION_DNS_SERVER_IN_DESIGN_URL, applicationId, dnsServerId);
    }

    /**
     * Get DHCP servers
     *
     * @param applicationId
     * @param aspect
     * @see ApplicationAspects
     * @return list of DHCP servers
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#get-dhcp-servers-list"></a>
     */
    public RavelloDhcpServers getDhcpServers(long applicationId, ApplicationAspects aspect) {
        return this.get(RavelloDhcpServers.class, APPLICATION_DHCP_SERVERS_ASPECT_URL, applicationId, aspect.toString());
    }

    /**
     * Get DHCP server
     *
     * @param applicationId
     * @param dhcpServerId
     * @param aspect
     * @see ApplicationAspects
     * @return requested DHCP server
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#get-dhcp-server"></a>
     */
    public RavelloDhcpServer getDhcpServer(long applicationId, long dhcpServerId, ApplicationAspects aspect) {
        return this.get(RavelloDhcpServer.class, APPLICATION_DHCP_SERVER_URL, applicationId, dhcpServerId, aspect.toString());
    }

    /**
     * Create DHCP server
     *
     * @param createDhcpServerPayload object representing request body
     * @see CreateDhcpServerPayload
     * @param applicationId
     * @return the full application
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#create-dhcp-server"></a>
     */
    public RavelloApplication createDhcpServer(CreateDhcpServerPayload createDhcpServerPayload, long applicationId) {
        return this.post(RavelloApplication.class, createDhcpServerPayload, APPLICATION_DHCP_SERVERS_IN_DESIGN_URL, applicationId);
    }

    /**
     * Update DHCP server
     *
     * @param dhcpServer object representing request body
     * @param applicationId
     * @param dhcpServerId
     * @return the full application
     * @see <a href="https://www.ravellosystems.com/ravello-api-doc/#update-dhcp-server"></a>
     */
    public RavelloApplication updateDhcpServer(RavelloDhcpServer dhcpServer, long applicationId, long dhcpServerId) {
        return this.put(RavelloApplication.class, dhcpServer, APPLICATION_DHCP_SERVER_IN_DESIGN_URL, applicationId, dhcpServerId);
    }

    /**
     * Delete DHCP server
     *
     * @param applicationId
     * @param dhcpServerId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-dhcp-server"></a>
     */
    public RavelloApplication deleteDhcpServer(long applicationId, long dhcpServerId) {
        return this.delete(RavelloApplication.class, APPLICATION_DHCP_SERVER_IN_DESIGN_URL, applicationId, dhcpServerId);
    }

    /**
     * Get Network Interfaces
     *
     * @param applicationId
     * @param aspect
     * @return network interfaces
     * @see ApplicationAspects
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-network-interfaces-list"></a>
     */
    public RavelloNetworkInterfaces getNetworkInterfaces(long applicationId, ApplicationAspects aspect) {
        return this.get(RavelloNetworkInterfaces.class, APPLICATION_NETWORK_INTERFACES_ASPECT_URL, applicationId, aspect.toString());
    }

    /**
     * Get Network Interface from the application
     *
     * @param applicationId
     * @param networkInterfaceId
     * @return the Network Interface from application
     * @see ApplicationAspects
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-network-interface"></a>
     */
    public RavelloNetworkInterface getNetworkInterface(long applicationId, long networkInterfaceId, ApplicationAspects aspect) {
        return this.get(RavelloNetworkInterface.class, APPLICATION_NETWORK_INTERFACE_ASPECT_URL, applicationId, networkInterfaceId, aspect.toString());
    }

    /**
     * WARNING: attempts to add a mac-address field are likely to fail
     *
     * Create a new Network Interface
     *
     * @param networkInterfacePayload object representing request body
     * @param applicationId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-network-interface"></a>
     */
    public RavelloApplication createNetworkInterface(CreateNetworkInterfacePayload networkInterfacePayload, long applicationId) {
        // TODO: cannot create/update network interface with the defined macAddress (useAutoMacAddress=false)
        return this.post(RavelloApplication.class, networkInterfacePayload, APPLICATION_NETWORK_INTERFACES_IN_DESIGN_URL, applicationId);
    }

    /**
     * WARNING: attempts to update a mac-address field are likely to fail
     *
     * Update the specific Network Interface
     *
     * @param networkInterface
     * @param applicationId
     * @param networkInterfaceId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-network-interface"></a>
     */
    public RavelloApplication updateNetworkInterface(RavelloNetworkInterface networkInterface, long applicationId, long networkInterfaceId) {
        return this.put(RavelloApplication.class, networkInterface, APPLICATION_NETWORK_INTERFACE_IN_DESIGN_URL, applicationId, networkInterfaceId);
    }

    /**
     * Delete the specific Network Interface
     *
     * @param applicationId
     * @param networkInterfaceId
     * @return the full application
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-network-interface"></a>
     */
    public RavelloApplication deleteNetworkInterface(long applicationId, long networkInterfaceId) {
        return this.delete(RavelloApplication.class, APPLICATION_NETWORK_INTERFACE_IN_DESIGN_URL, applicationId, networkInterfaceId);
    }

    /*****************************************************/
    /********************Blueprints***********************/
    /*****************************************************/


    /**
     * Get Blueprints list
     *
     * @return all blueprints
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-blueprints-list></a>
     */
    public RavelloBlueprints getBlueprints() {
        return this.get(RavelloBlueprints.class, BLUEPRINTS_URL);
    }

    /**
     * Get Blueprint by id
     *
     * @param blueprintId
     * @return blueprint by the specified id
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-blueprint"></a>
     */
    public RavelloBlueprint getBlueprint(long blueprintId) {
        return this.get(RavelloBlueprint.class, BLUEPRINT_URL, blueprintId);
    }

    /**
     * Create Blueprint
     *
     * @param createRavelloBlueprintPayload object representing request body
     * @return created blueprint
     * @see CreateBlueprintPayload
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-blueprint"></a>
     */
    public RavelloBlueprint createBlueprint(CreateBlueprintPayload createRavelloBlueprintPayload) {
        return this.post(RavelloBlueprint.class, createRavelloBlueprintPayload, CREATE_BLUEPRINT_URL);
    }

    /**
     * Delete Blueprint by id
     *
     * @param blueprintId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-blueprint"></a>
     */
    public void deleteBlueprint(long blueprintId) {
        this.delete(BLUEPRINT_URL, blueprintId);
    }

    /**
     * Get all the possible publish locations for the Application that will be created from this Blueprint
     *
     * @param blueprintId
     * @return possible publish locations
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-all-publish-locations79"></a>
     */
    public RavelloLocations getPublishLocations(long blueprintId) {
        return this.get(RavelloLocations.class, BLUEPRINT_PUBLISH_LOCATIONS_URL, blueprintId);
    }


    /*****************************************************/
    /********************Images***************************/
    /*****************************************************/

    /**
     * Get Images list
     *
     * @return all images
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-images-list></a>
     */
    public RavelloImages getImages() {
        return this.get(RavelloImages.class, IMAGES_URL);
    }

    /**
     * Get Image by id
     *
     * @param imageId
     * @return image by the specified id
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-image></a>
     */
    public RavelloImage getImage(long imageId) {
        return this.get(RavelloImage.class, IMAGE_URL, imageId);
    }

    /**
     * Create a new Image
     *
     * @param createImagePayload object representing request body
     * @see CreateImagePayload
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#create-image></a>
     */
    public void createImage(CreateImagePayload createImagePayload) {
        this.post(createImagePayload, IMAGES_URL);
    }

    /**
     * Update the Image
     * Usually used after getting Image by id {@link com.firedome.ravello.RavelloClient#getImage(long)}
     *
     * @param ravelloImage object representing request body
     * @param imageId
     * @see com.firedome.ravello.model.RavelloImage
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#update-image"></a>
     */
    public void updateImage(RavelloImage ravelloImage, long imageId) {
        this.put(ravelloImage, IMAGE_URL, imageId);
    }

    /**
     * Delete Image by id
     *
     * @param imageId
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#delete-image></a>
     */
    public void deleteImage(long imageId) {
        this.delete(IMAGE_URL, imageId);
    }

    /*****************************************************/
    /********************Users***************************/
    /*****************************************************/

    /**
     * Get current User
     *
     * @return the authenticated user details
     * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#get-the-authenticated-user></a>
     */
    public RavelloUser getAuthenticatedUser() {
        return this.get(RavelloUser.class, USER_URL);
    }


    protected <T> T get(Class<T> responseType, String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).get();
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
        return response.readEntity(responseType);
    }

    protected <T> T post(Class<T> responseType,  Resource payload, String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).post(Entity.json(payload));
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
        return response.readEntity(responseType);
    }

    protected void post(Resource payload, String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).post(Entity.json(payload));
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
    }

    protected <T> T put(Class<T> responseType, Resource payload, String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).put(Entity.json(payload));
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
        return response.readEntity(responseType);
    }

    protected void put(Resource payload, String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).put(Entity.json(payload));
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
    }

    protected  <T> T delete(Class<T> responseType, String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).delete();
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
        return response.readEntity(responseType);
    }

    protected  void delete(String url, Object... params) {
        Response response = client.target(String.format(url, params)).request().header(HEADER_NAME, MediaType.APPLICATION_JSON).delete();
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new RavelloException(response.getStatus(), response.getHeaderString(ERROR_CODE_HEADER_KEY), response.getHeaderString(ERROR_MESSAGE_HEADER_KEY));
        }
    }

    static class Authenticator implements ClientRequestFilter {

        private final String user;
        private final String password;

        public Authenticator(String user, String password) {
            this.user = user;
            this.password = password;
        }

        public void filter(ClientRequestContext requestContext) throws IOException {
            MultivaluedMap<String, Object> headers = requestContext.getHeaders();
            final String basicAuthentication = getBasicAuthentication();
            headers.add("Authorization", basicAuthentication);

        }

        private String getBasicAuthentication() {
            String token = this.user + ":" + this.password;
            try {
                return "BASIC " + DatatypeConverter.printBase64Binary(token.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException ex) {
                throw new IllegalStateException("Cannot encode with UTF-8", ex);
            }
        }
    }

    public static void main(String[] args) throws Exception { }
}
