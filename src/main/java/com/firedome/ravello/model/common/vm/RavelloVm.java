package com.firedome.ravello.model.common.vm;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.vm.harddrive.RavelloHardDrive;
import com.firedome.ravello.model.common.vm.networkconnection.RavelloNetworkConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes Ravello VM model
 *
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#vm-properties></a>
 */
public class RavelloVm extends Resource {

    private Long id;
    private String name;
    private String description;
    private Long creationTime;
    private RavelloMemorySize memorySize;
    private Integer numCpus;
    private String platform;
    private String os;
    private Integer rcu;
    private Boolean supportsCloudInit;
    private Boolean requiresKeypair;
    private Boolean useCdn;
    private Boolean privateCloudImage;
    private List<String> hostnames = new ArrayList<>();
    private Long applicationId;
    private Boolean legacyMode;
    private String loadingStatus;
    private Integer loadingPercentage;
    private Long keypairId;
    private String keypairName;
    private Long baseVmId;
    private String biosUuid;
    private Boolean allowNested;
    private List<RavelloSuppliedService> suppliedServices = new ArrayList<>();
    private List<RavelloNetworkConnection> networkConnections = new ArrayList<>();
    private List<RavelloHardDrive> hardDrives = new ArrayList<>();
    private Object busStructure;
    private RavelloConfigurationManagement configurationManagement;
    private List<String> bootOrder = new ArrayList<>();
    private String stopTimeOut;
    private Boolean powerOffOnStopTimeOut;
    private Boolean configNetworkUsingCloudInit;
    private Boolean usingNewNetwork;
    private String bootType;
    private String state;
    private String monitorState;
    private String externalFqdn;
    private String firstTimePublished;
    private Boolean requiresHvm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public RavelloMemorySize getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(RavelloMemorySize memorySize) {
        this.memorySize = memorySize;
    }

    public Integer getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(Integer numCpus) {
        this.numCpus = numCpus;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getRcu() {
        return rcu;
    }

    public void setRcu(Integer rcu) {
        this.rcu = rcu;
    }

    public Boolean getSupportsCloudInit() {
        return supportsCloudInit;
    }

    public void setSupportsCloudInit(Boolean supportsCloudInit) {
        this.supportsCloudInit = supportsCloudInit;
    }

    public Boolean getRequiresKeypair() {
        return requiresKeypair;
    }

    public void setRequiresKeypair(Boolean requiresKeypair) {
        this.requiresKeypair = requiresKeypair;
    }

    public Boolean getUseCdn() {
        return useCdn;
    }

    public void setUseCdn(Boolean useCdn) {
        this.useCdn = useCdn;
    }

    public Boolean getPrivateCloudImage() {
        return privateCloudImage;
    }

    public void setPrivateCloudImage(Boolean privateCloudImage) {
        this.privateCloudImage = privateCloudImage;
    }

    public List<String> getHostnames() {
        return hostnames;
    }

    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Boolean getLegacyMode() {
        return legacyMode;
    }

    public void setLegacyMode(Boolean legacyMode) {
        this.legacyMode = legacyMode;
    }

    public String getLoadingStatus() {
        return loadingStatus;
    }

    public void setLoadingStatus(String loadingStatus) {
        this.loadingStatus = loadingStatus;
    }

    public Integer getLoadingPercentage() {
        return loadingPercentage;
    }

    public void setLoadingPercentage(Integer loadingPercentage) {
        this.loadingPercentage = loadingPercentage;
    }

    public Long getKeypairId() {
        return keypairId;
    }

    public void setKeypairId(Long keypairId) {
        this.keypairId = keypairId;
    }

    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public Long getBaseVmId() {
        return baseVmId;
    }

    public void setBaseVmId(Long baseVmId) {
        this.baseVmId = baseVmId;
    }

    public String getBiosUuid() {
        return biosUuid;
    }

    public void setBiosUuid(String biosUuid) {
        this.biosUuid = biosUuid;
    }

    public Boolean getAllowNested() {
        return allowNested;
    }

    public void setAllowNested(Boolean allowNested) {
        this.allowNested = allowNested;
    }

    public List<RavelloSuppliedService> getSuppliedServices() {
        return suppliedServices;
    }

    public void setSuppliedServices(List<RavelloSuppliedService> suppliedServices) {
        this.suppliedServices = suppliedServices;
    }

    public List<RavelloNetworkConnection> getNetworkConnections() {
        return networkConnections;
    }

    public void setNetworkConnections(List<RavelloNetworkConnection> networkConnections) {
        this.networkConnections = networkConnections;
    }

    public List<RavelloHardDrive> getHardDrives() {
        return hardDrives;
    }

    public void setHardDrives(List<RavelloHardDrive> hardDrives) {
        this.hardDrives = hardDrives;
    }

    public Object getBusStructure() {
        return busStructure;
    }

    public void setBusStructure(Object busStructure) {
        this.busStructure = busStructure;
    }

    public RavelloConfigurationManagement getConfigurationManagement() {
        return configurationManagement;
    }

    public void setConfigurationManagement(RavelloConfigurationManagement configurationManagement) {
        this.configurationManagement = configurationManagement;
    }

    public List<String> getBootOrder() {
        return bootOrder;
    }

    public void setBootOrder(List<String> bootOrder) {
        this.bootOrder = bootOrder;
    }

    public String getStopTimeOut() {
        return stopTimeOut;
    }

    public void setStopTimeOut(String stopTimeOut) {
        this.stopTimeOut = stopTimeOut;
    }

    public Boolean getPowerOffOnStopTimeOut() {
        return powerOffOnStopTimeOut;
    }

    public void setPowerOffOnStopTimeOut(Boolean powerOffOnStopTimeOut) {
        this.powerOffOnStopTimeOut = powerOffOnStopTimeOut;
    }

    public Boolean getConfigNetworkUsingCloudInit() {
        return configNetworkUsingCloudInit;
    }

    public void setConfigNetworkUsingCloudInit(Boolean configNetworkUsingCloudInit) {
        this.configNetworkUsingCloudInit = configNetworkUsingCloudInit;
    }

    public Boolean getUsingNewNetwork() {
        return usingNewNetwork;
    }

    public void setUsingNewNetwork(Boolean usingNewNetwork) {
        this.usingNewNetwork = usingNewNetwork;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMonitorState() {
        return monitorState;
    }

    public void setMonitorState(String monitorState) {
        this.monitorState = monitorState;
    }

    public String getExternalFqdn() {
        return externalFqdn;
    }

    public void setExternalFqdn(String externalFqdn) {
        this.externalFqdn = externalFqdn;
    }

    public String getFirstTimePublished() {
        return firstTimePublished;
    }

    public void setFirstTimePublished(String firstTimePublished) {
        this.firstTimePublished = firstTimePublished;
    }

    public Boolean getRequiresHvm() {
        return requiresHvm;
    }

    public void setRequiresHvm(Boolean requiresHvm) {
        this.requiresHvm = requiresHvm;
    }

    public String getBootType() {
        return bootType;
    }

    public void setBootType(String bootType) {
        this.bootType = bootType;
    }
}
