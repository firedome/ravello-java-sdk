package com.firedome.ravello.model.application.network.switches.port;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.switches.port.networkSegmentReference.RavelloNetworkSegmentReference;

import java.util.List;

/**
 * Describes Ravello Port model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#port-properties></a>
 */
public class RavelloPort extends Resource {

    private long id;
    private Integer index;
    private String deviceType;
    private long deviceId;
    private List<RavelloNetworkSegmentReference> networkSegmentReferences;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public List<RavelloNetworkSegmentReference> getNetworkSegmentReferences() {
        return networkSegmentReferences;
    }

    public void setNetworkSegmentReferences(List<RavelloNetworkSegmentReference> networkSegmentReferences) {
        this.networkSegmentReferences = networkSegmentReferences;
    }
}
