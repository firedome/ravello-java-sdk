package com.firedome.ravello.payload.vm.networkconnection;

import com.firedome.ravello.Resource;

public class NetworkConnectionPayload extends Resource {

    private Long id;
    private DevicePayload device;
    private IpConfigPayload ipConfig;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DevicePayload getDevice() {
        return device;
    }

    public void setDevice(DevicePayload device) {
        this.device = device;
    }

    public IpConfigPayload getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(IpConfigPayload ipConfig) {
        this.ipConfig = ipConfig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
