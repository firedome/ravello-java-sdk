package com.firedome.ravello.model;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Owner Details model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#application-objects></a>
 */
public class RavelloOwnerDetails extends Resource {

    private long userId;
    private String name;
    private boolean deleted;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
