package com.firedome.ravello.model.application;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Cost Bucket model
 */
public class RavelloCostBucket extends Resource {

    private long id;
    private long creationTime;
    private String name;
    private boolean deleted;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
