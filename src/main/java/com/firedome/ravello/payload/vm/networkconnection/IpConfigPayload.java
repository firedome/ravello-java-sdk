package com.firedome.ravello.payload.vm.networkconnection;

import com.firedome.ravello.Resource;

public class IpConfigPayload extends Resource {

    private Long id;
    private String fqdn;
    private Object autoIpConfig; //TODO object is empty in JSON
    private Boolean hasPublicIp; //TODO changeable name ("publicIp" or "hasPublicIp")
    private String externalAccessState;
    private Boolean needElasticIp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
