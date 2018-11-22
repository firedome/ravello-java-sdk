package com.firedome.ravello.model.auxiliary;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Vm FQDN model
 */
public class RavelloFQDN extends Resource {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
