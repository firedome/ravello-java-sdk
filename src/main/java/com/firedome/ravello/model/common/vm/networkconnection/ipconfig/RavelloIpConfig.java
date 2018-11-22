package com.firedome.ravello.model.common.vm.networkconnection.ipconfig;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.vm.networkconnection.ipconfig.staticipconfig.RavelloStaticIpConfig;

import java.util.List;

/**
 * Describes Ravello Ip Configuration model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#ip-configuration-device-object></a>
 */
public class RavelloIpConfig extends Resource {

    private Long id;
    private String fqdn;
    private RavelloStaticIpConfig staticIpConfig;
    private Object autoIpConfig; //TODO object is empty in JSON
    private Boolean hasPublicIp; //TODO changeable name ("publicIp" or "hasPublicIp")
    private String publicIp;
    private String externalAccessState;
    private Boolean needElasticIp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RavelloStaticIpConfig getStaticIpConfig() {
        return staticIpConfig;
    }

    public void setStaticIpConfig(RavelloStaticIpConfig staticIpConfig) {
        this.staticIpConfig = staticIpConfig;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public Object getAutoIpConfig() {
        return autoIpConfig;
    }

    public void setAutoIpConfig(Object autoIpConfig) {
        this.autoIpConfig = autoIpConfig;
    }

    public Boolean getHasPublicIp() {
        return hasPublicIp;
    }

    public void setHasPublicIp(Boolean hasPublicIp) {
        this.hasPublicIp = hasPublicIp;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getExternalAccessState() {
        return externalAccessState;
    }

    public void setExternalAccessState(String externalAccessState) {
        this.externalAccessState = externalAccessState;
    }

    public Boolean getNeedElasticIp() {
        return needElasticIp;
    }

    public void setNeedElasticIp(Boolean needElasticIp) {
        this.needElasticIp = needElasticIp;
    }
}
