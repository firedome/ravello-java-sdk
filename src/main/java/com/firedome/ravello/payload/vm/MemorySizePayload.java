package com.firedome.ravello.payload.vm;

import com.firedome.ravello.Resource;

public class MemorySizePayload extends Resource {

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
