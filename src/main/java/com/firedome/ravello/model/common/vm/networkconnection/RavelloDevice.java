package com.firedome.ravello.model.common.vm.networkconnection;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Device model
 */
public class RavelloDevice extends Resource {

    private String mac;
    private Boolean useAutomaticMac;
    private Integer index;
    private Integer pciSlot;
    private String deviceType;
    private String generatedMac;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Boolean getUseAutomaticMac() {
        return useAutomaticMac;
    }

    public void setUseAutomaticMac(Boolean useAutomaticMac) {
        this.useAutomaticMac = useAutomaticMac;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getPciSlot() {
        return pciSlot;
    }

    public void setPciSlot(Integer pciSlot) {
        this.pciSlot = pciSlot;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getGeneratedMac() {
        return generatedMac;
    }

    public void setGeneratedMac(String generatedMac) {
        this.generatedMac = generatedMac;
    }
}