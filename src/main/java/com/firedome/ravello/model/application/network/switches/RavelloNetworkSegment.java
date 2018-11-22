package com.firedome.ravello.model.application.network.switches;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Network Segment model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#network-segment-properties></a>
 */
public class RavelloNetworkSegment extends Resource {

    private long id;
    private long vlanId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVlanId() {
        return vlanId;
    }

    public void setVlanId(long vlanId) {
        this.vlanId = vlanId;
    }
}
