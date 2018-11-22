package com.firedome.ravello.model.application.deployment.cloudregion.cloud;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Cloud model
 */
public class RavelloCloud extends Resource {

    private String name;
    private String displayName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
