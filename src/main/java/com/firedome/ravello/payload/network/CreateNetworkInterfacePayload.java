package com.firedome.ravello.payload.network;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.vm.networkconnection.ipconfig.RavelloIpConfig;

import java.util.List;

public class CreateNetworkInterfacePayload extends Resource {

    private long appId;
    private String name;
    private String macAddress;
    private boolean useAutoMacAddress;
    private List<RavelloIpConfig> ipConfigurations;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public boolean isUseAutoMacAddress() {
        return useAutoMacAddress;
    }

    public void setUseAutoMacAddress(boolean useAutoMacAddress) {
        this.useAutoMacAddress = useAutoMacAddress;
    }

    public List<RavelloIpConfig> getIpConfigurations() {
        return ipConfigurations;
    }

    public void setIpConfigurations(List<RavelloIpConfig> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
    }
}
