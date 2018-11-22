package com.firedome.ravello.payload.network;

import com.firedome.ravello.Resource;

public class CreateSubnetPayload extends Resource {

    private String name;
    private long networkSegmentId;
    private String ipVersion;
    private String net;
    private String mask;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNetworkSegmentId() {
        return networkSegmentId;
    }

    public void setNetworkSegmentId(long networkSegmentId) {
        this.networkSegmentId = networkSegmentId;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
