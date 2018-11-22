package com.firedome.ravello.model.application.network.service.dnsserver.entry;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Entry model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#dns-entry-properties></a>
 */
public class RavelloEntry extends Resource {

    private long id;
    private String name;
    private long ipConfigurationId;
    private String type;
    private Integer index;

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

    public long getIpConfigurationId() {
        return ipConfigurationId;
    }

    public void setIpConfigurationId(long ipConfigurationId) {
        this.ipConfigurationId = ipConfigurationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
