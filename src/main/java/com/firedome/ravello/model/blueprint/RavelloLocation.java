package com.firedome.ravello.model.blueprint;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Location model
 *
 */
public class RavelloLocation extends Resource {

    private String cloudName;
    private String cloudDisplayName;
    private String regionName;
    private String regionDisplayName;
    private Boolean deprecated;

    public String getCloudName() {
        return cloudName;
    }

    public void setCloudName(String cloudName) {
        this.cloudName = cloudName;
    }

    public String getCloudDisplayName() {
        return cloudDisplayName;
    }

    public void setCloudDisplayName(String cloudDisplayName) {
        this.cloudDisplayName = cloudDisplayName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionDisplayName() {
        return regionDisplayName;
    }

    public void setRegionDisplayName(String regionDisplayName) {
        this.regionDisplayName = regionDisplayName;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }
}
