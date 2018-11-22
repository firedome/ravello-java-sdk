package com.firedome.ravello.model.application.network.service.router;

import com.firedome.ravello.Resource;

public class RavelloSnatRule extends Resource {

    private long serviceId;
    private long sourceIpId;

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public long getSourceIpId() {
        return sourceIpId;
    }

    public void setSourceIpId(long sourceIpId) {
        this.sourceIpId = sourceIpId;
    }
}
