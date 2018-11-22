package com.firedome.ravello.model.common.design;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello VM Order Groups model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#setting-the-vm-start-stop-order></a>
 */
public class RavelloVmOrderGroups extends Resource {

    private long id;
    private String name;
    private long order;
    private boolean skipStartupSequence;
    private long delay;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public boolean isSkipStartupSequence() {
        return skipStartupSequence;
    }

    public void setSkipStartupSequence(boolean skipStartupSequence) {
        this.skipStartupSequence = skipStartupSequence;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
}
