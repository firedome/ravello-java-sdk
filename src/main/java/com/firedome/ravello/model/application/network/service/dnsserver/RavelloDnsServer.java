package com.firedome.ravello.model.application.network.service.dnsserver;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.dnsserver.entry.RavelloEntry;

import java.util.List;

/**
 * Describes Ravello DNS Server model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#dns-server-inner-objects></a>
 */
public class RavelloDnsServer extends Resource {

    private long id;
    private String name;
    private List<Long> ipConfigurationIds;
    private List<RavelloEntry> entries;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getIpConfigurationIds() {
        return ipConfigurationIds;
    }

    public void setIpConfigurationIds(List<Long> ipConfigurationIds) {
        this.ipConfigurationIds = ipConfigurationIds;
    }

    public List<RavelloEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<RavelloEntry> entries) {
        this.entries = entries;
    }
}
