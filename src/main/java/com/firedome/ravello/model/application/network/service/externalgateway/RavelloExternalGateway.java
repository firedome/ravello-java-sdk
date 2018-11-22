package com.firedome.ravello.model.application.network.service.externalgateway;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.externalgateway.natrule.RavelloNatRule;
import com.firedome.ravello.model.application.network.service.externalgateway.securityrule.RavelloSecurityRule;

import java.util.List;

/**
 * Describes Ravello External Gateway model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#external-gateway-properties></a>
 */
public class RavelloExternalGateway extends Resource {

    private long id;
    private boolean customRulesEnabled;
    private List<RavelloNatRule> natRules;
    private List<RavelloSecurityRule> securityRules;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCustomRulesEnabled() {
        return customRulesEnabled;
    }

    public void setCustomRulesEnabled(boolean customRulesEnabled) {
        this.customRulesEnabled = customRulesEnabled;
    }

    public List<RavelloNatRule> getNatRules() {
        return natRules;
    }

    public void setNatRules(List<RavelloNatRule> natRules) {
        this.natRules = natRules;
    }

    public List<RavelloSecurityRule> getSecurityRules() {
        return securityRules;
    }

    public void setSecurityRules(List<RavelloSecurityRule> securityRules) {
        this.securityRules = securityRules;
    }
}
