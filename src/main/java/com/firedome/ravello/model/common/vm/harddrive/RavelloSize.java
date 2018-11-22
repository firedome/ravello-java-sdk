package com.firedome.ravello.model.common.vm.harddrive;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Size model
 */
public class RavelloSize extends Resource {
    private Integer value;
    private String unit;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
