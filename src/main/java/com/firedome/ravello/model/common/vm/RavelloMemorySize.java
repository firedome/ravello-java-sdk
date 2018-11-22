package com.firedome.ravello.model.common.vm;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Memory Size model
 */
public class RavelloMemorySize extends Resource {

    private Integer value;
    private String unit;

    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}