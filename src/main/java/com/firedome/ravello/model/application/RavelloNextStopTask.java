package com.firedome.ravello.model.application;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Next Stop Task model
 */
public class RavelloNextStopTask extends Resource {

    private long time;
    private long id;
    private String timezone;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
