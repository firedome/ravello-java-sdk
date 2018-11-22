package com.firedome.ravello.payload.network;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.switches.port.networkSegmentReference.RavelloNetworkSegmentReference;

import java.util.List;

public class CreatePortPayload extends Resource {

    private Integer index;
    private String deviceType;
    private long deviceId;
    private List<RavelloNetworkSegmentReference> networkSegmentPreferences;

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

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public List<RavelloNetworkSegmentReference> getNetworkSegmentPreferences() {
        return networkSegmentPreferences;
    }

    public void setNetworkSegmentPreferences(List<RavelloNetworkSegmentReference> networkSegmentPreferences) {
        this.networkSegmentPreferences = networkSegmentPreferences;
    }
}
