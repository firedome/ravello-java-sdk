package com.firedome.ravello.model.application.network.service.networkinterface.ipconfiguration;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.networkinterface.ipconfiguration.staticipconfig.RavelloStaticIpConfig;

import java.util.List;

/**
 * Describes Ravello Ip Configuration model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#network-interface-properties></a>
 */
public class RavelloIpConfiguration extends Resource {

    private long id;
    private List<RavelloStaticIpConfig> staticIpConfig;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<RavelloStaticIpConfig> getStaticIpConfig() {
        return staticIpConfig;
    }

    public void setStaticIpConfig(List<RavelloStaticIpConfig> staticIpConfig) {
        this.staticIpConfig = staticIpConfig;
    }
}
