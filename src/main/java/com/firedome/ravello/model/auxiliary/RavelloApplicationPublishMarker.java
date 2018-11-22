package com.firedome.ravello.model.auxiliary;

import com.firedome.ravello.Resource;

/**
 * Describes model showing is application published
 */
public class RavelloApplicationPublishMarker extends Resource {

    private Boolean value;

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
