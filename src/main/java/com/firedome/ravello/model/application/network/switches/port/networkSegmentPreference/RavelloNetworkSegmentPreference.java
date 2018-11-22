package com.firedome.ravello.model.application.network.switches.port.networkSegmentPreference;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Port model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#network-segment-reference-properties></a>
 */
public class RavelloNetworkSegmentPreference extends Resource {

    private long id;
    private long networkSegmentId;
    private Boolean anyNetworkSegment;
    private String egressPolicy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNetworkSegmentId() {
        return networkSegmentId;
    }

    public void setNetworkSegmentId(long networkSegmentId) {
        this.networkSegmentId = networkSegmentId;
    }

    public Boolean getAnyNetworkSegment() {
        return anyNetworkSegment;
    }

    public void setAnyNetworkSegment(Boolean anyNetworkSegment) {
        this.anyNetworkSegment = anyNetworkSegment;
    }

    public String getEgressPolicy() {
        return egressPolicy;
    }

    public void setEgressPolicy(String egressPolicy) {
        this.egressPolicy = egressPolicy;
    }
}
