package com.firedome.ravello.payload;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firedome.ravello.Resource;

public class PublishApplicationPayload extends Resource {

    private String preferredRegion = "eu-west-2"; /* PreferredRegion is required only if optimizationLevel is PERFORMANCE_OPTIMIZED.*/
    private String optimizationLevel = "PERFORMANCE_OPTIMIZED";

    public PublishApplicationPayload() {
    }

    @JsonIgnore
    public PublishApplicationPayload(String preferredRegion, String optimizationLevel) {
        this.preferredRegion = preferredRegion;
        this.optimizationLevel = optimizationLevel;
    }

    public String getPreferredRegion() {
        return preferredRegion;
    }

    public void setPreferredRegion(String preferredRegion) {
        this.preferredRegion = preferredRegion;
    }

    public String getOptimizationLevel() {
        return optimizationLevel;
    }

    public void setOptimizationLevel(String optimizationLevel) {
        this.optimizationLevel = optimizationLevel;
    }
}
