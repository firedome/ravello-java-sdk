package com.firedome.ravello.payload.network;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.router.RavelloSnatRule;

import java.util.List;

public class CreateRouterPayload extends Resource {

    private String name;
    private List<Long> ipConfigurationIds;
    private Boolean wan;
    private List<RavelloSnatRule> snatRules;

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
