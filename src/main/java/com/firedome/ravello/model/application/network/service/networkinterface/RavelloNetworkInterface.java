package com.firedome.ravello.model.application.network.service.networkinterface;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.vm.networkconnection.ipconfig.RavelloIpConfig;

import java.util.List;

/**
 * Describes Ravello Network Interface model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#network-interface-properties></a>
 */
public class RavelloNetworkInterface extends Resource {

    private long id;
    private String name;
    private String macAddress;
    private Boolean useAutoMacAddress;
    private String autoMacAddress;
    private List<RavelloIpConfig> ipConfigurations;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Boolean isUseAutoMacAddress() {
        return useAutoMacAddress;
    }

    public void setUseAutoMacAddress(Boolean useAutoMacAddress) {
        this.useAutoMacAddress = useAutoMacAddress;
    }

    public String getAutoMacAddress() {
        return autoMacAddress;
    }

    public void setAutoMacAddress(String autoMacAddress) {
        this.autoMacAddress = autoMacAddress;
    }

    public List<RavelloIpConfig> getIpConfigurations() {
        return ipConfigurations;
    }

    public void setIpConfigurations(List<RavelloIpConfig> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
    }
}
