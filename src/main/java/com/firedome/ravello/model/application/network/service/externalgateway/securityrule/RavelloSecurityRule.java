package com.firedome.ravello.model.application.network.service.externalgateway.securityrule;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Security Rule model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#security-rule-properties></a>
 */
public class RavelloSecurityRule extends Resource {

    private long id;
    private Boolean anySource;
    private String accessPolicy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getAnySource() {
        return anySource;
    }

    public void setAnySource(Boolean anySource) {
        this.anySource = anySource;
    }

    public String getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }
}
