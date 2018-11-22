package com.firedome.ravello.model.common.vm.networkconnection;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.vm.networkconnection.ipconfig.RavelloIpConfig;

/**
 * Describes Ravello Network Connection model
 */
public class RavelloNetworkConnection extends Resource {

    private Long id;
    private RavelloDevice device;
    private RavelloIpConfig ipConfig;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RavelloDevice getDevice() {
        return device;
    }

    public void setDevice(RavelloDevice device) {
        this.device = device;
    }

    public RavelloIpConfig getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(RavelloIpConfig ipConfig) {
        this.ipConfig = ipConfig;
    }
}