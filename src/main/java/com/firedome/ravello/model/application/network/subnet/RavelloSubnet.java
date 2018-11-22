package com.firedome.ravello.model.application.network.subnet;

import com.firedome.ravello.Resource;

import java.util.List;

/**
 * Describes Ravello Subnet model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#subnet-properties></a>
 */
public class RavelloSubnet extends Resource {

    private String name;
    private long id;
    private long networkSegmentId;
    private String ipVersion;
    private String net;
    private String mask;
    private List<Long> ipConfigurationIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public List<Long> getIpConfigurationIds() {
        return ipConfigurationIds;
    }

    public void setIpConfigurationIds(List<Long> ipConfigurationIds) {
        this.ipConfigurationIds = ipConfigurationIds;
    }
}
