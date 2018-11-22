package com.firedome.ravello.payload;

import com.firedome.ravello.Resource;

public class CreateApplicationPayload extends Resource {

    private String name;
    private String description;
    private long baseBlueprintId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getBaseBlueprintId() {
        return baseBlueprintId;
    }

    public void setBaseBlueprintId(long baseBlueprintId) {
        this.baseBlueprintId = baseBlueprintId;
    }
}
