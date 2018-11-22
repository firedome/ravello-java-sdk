package com.firedome.ravello.model.common.vm.harddrive;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Bios Geometry model
 */
public class RavelloBiosGeometry extends Resource {

    private Integer cyls;
    private Integer heads;
    private Integer secs;

    public Integer getCyls() {
        return cyls;
    }

    public void setCyls(Integer cyls) {
        this.cyls = cyls;
    }

    public Integer getHeads() {
        return heads;
    }

    public void setHeads(Integer heads) {
        this.heads = heads;
    }

    public Integer getSecs() {
        return secs;
    }

    public void setSecs(Integer secs) {
        this.secs = secs;
    }
}