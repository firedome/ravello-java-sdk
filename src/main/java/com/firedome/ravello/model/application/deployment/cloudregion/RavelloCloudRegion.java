package com.firedome.ravello.model.application.deployment.cloudregion;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.deployment.cloudregion.cloud.RavelloCloud;

/**
 * Describes Ravello Cloud Region model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#cloud-region-properties></a>
 */
public class RavelloCloudRegion extends Resource {

    private String name;
    private String displayName;
    private RavelloCloud cloud;
    private boolean deprecated;

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

    public RavelloCloud getCloud() {
        return cloud;
    }

    public void setCloud(RavelloCloud ravelloCloud) {
        this.cloud = ravelloCloud;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }
}
