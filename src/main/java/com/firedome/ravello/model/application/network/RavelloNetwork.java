package com.firedome.ravello.model.application.network;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.RavelloService;
import com.firedome.ravello.model.application.network.subnet.RavelloSubnet;
import com.firedome.ravello.model.application.network.switches.RavelloSwitch;

import java.util.List;

/**
 * Describes Ravello Network model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#network-inner-objects></a>
 */
public class RavelloNetwork extends Resource {

    private List<RavelloSwitch> switches;
    private List<RavelloSubnet> subnets;
    private RavelloService services;

    public List<RavelloSwitch> getSwitches() {
        return switches;
    }

    public void setSwitches(List<RavelloSwitch> switches) {
        this.switches = switches;
    }

    public List<RavelloSubnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<RavelloSubnet> subnets) {
        this.subnets = subnets;
    }

    public RavelloService getServices() {
        return services;
    }

    public void setServices(RavelloService services) {
        this.services = services;
    }
}
