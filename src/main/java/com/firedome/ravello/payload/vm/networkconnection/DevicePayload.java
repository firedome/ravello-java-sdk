package com.firedome.ravello.payload.vm.networkconnection;

import com.firedome.ravello.Resource;

public class DevicePayload extends Resource {

    private String mac;
    private Boolean useAutomaticMac;
    private Integer index;
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
