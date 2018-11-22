package com.firedome.ravello.model.auxiliary;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Vm Public Ips model
 */
public class RavelloPublicIps extends Resource {

    private String [] ips;

    public String[] getIps() {
        return ips;
    }

    public void setIps(String[] ips) {
        this.ips = ips;
    }
}
