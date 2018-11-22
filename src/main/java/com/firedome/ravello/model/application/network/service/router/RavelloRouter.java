package com.firedome.ravello.model.application.network.service.router;

import com.firedome.ravello.Resource;

import java.util.List;

/**
 * Describes Ravello Router model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#router-properties></a>
 */
public class RavelloRouter extends Resource {

    private long id;
    private String name;
    private List<Long> ipConfigurationIds;
    private Boolean wan;
    private List<RavelloSnatRule> snatRules;

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

    public Boolean getWan() {
        return wan;
    }

    public void setWan(Boolean wan) {
        this.wan = wan;
    }

    public List<RavelloSnatRule> getSnatRules() {
        return snatRules;
    }

    public void setSnatRules(List<RavelloSnatRule> snatRules) {
        this.snatRules = snatRules;
    }
}
