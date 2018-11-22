package com.firedome.ravello.model.application.network.service.dhcpserver.assignedipentry;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Assigned Ip Entry model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#dhcp-assigned-ip-entry-properties></a>
 */
public class RavelloAssignedIpEntry extends Resource {

    private long id;
    private long ipConfigurationId;
    private String ip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIpConfigurationId() {
        return ipConfigurationId;
    }

    public void setIpConfigurationId(long ipConfigurationId) {
        this.ipConfigurationId = ipConfigurationId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
