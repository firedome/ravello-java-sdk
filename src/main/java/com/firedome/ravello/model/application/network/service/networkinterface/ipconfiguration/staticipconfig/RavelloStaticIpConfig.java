package com.firedome.ravello.model.application.network.service.networkinterface.ipconfiguration.staticipconfig;

import com.firedome.ravello.Resource;
/**
 * Describes Ravello Static Ip Config model
 */
public class RavelloStaticIpConfig extends Resource {

    private String ip;
    private String mask;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
