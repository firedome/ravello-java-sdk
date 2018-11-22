package com.firedome.ravello.model.application.network.switches;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.switches.port.RavelloPort;

import java.util.List;

/**
 * Describes Ravello Switch model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#switch-properties></a>
 */
public class RavelloSwitch extends Resource {

    private long id;
    private String name;
    private List<RavelloPort> ports;
    private List<RavelloNetworkSegment> networkSegments;

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

    public List<RavelloPort> getPorts() {
        return ports;
    }

    public void setPorts(List<RavelloPort> ports) {
        this.ports = ports;
    }

    public List<RavelloNetworkSegment> getNetworkSegments() {
        return networkSegments;
    }

    public void setNetworkSegments(List<RavelloNetworkSegment> networkSegments) {
        this.networkSegments = networkSegments;
    }
}
