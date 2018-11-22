package com.firedome.ravello.model.application.network.service.dhcpserver.excludedipentry;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Excluded Ip Entry model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#dhcp-excluded-ip-entry-properties></a>
 */
public class RavelloExcludedIpEntry extends Resource {

    private long id;
    private String ip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
