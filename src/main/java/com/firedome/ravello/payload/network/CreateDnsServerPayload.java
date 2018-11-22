package com.firedome.ravello.payload.network;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.dnsserver.entry.RavelloEntry;

import java.util.List;

public class CreateDnsServerPayload extends Resource {

    private String name;
    private List<Long> ipConfigurationIds;
    private List<RavelloEntry> entries;

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
