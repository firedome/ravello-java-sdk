package com.firedome.ravello.model.application.network.service.externalgateway.natrule;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Nat Rule model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#nat-rule-properties></a>
 */
public class RavelloNatRule extends Resource {

    private long serviceId;

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }
}
