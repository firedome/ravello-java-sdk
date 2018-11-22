package com.firedome.ravello.model.common;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Owner Details model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#application-objects></a>
 */
public class RavelloOwnerDetails extends Resource {

    private Long userId;
    private String name;
    private Boolean deleted;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
