package com.firedome.ravello.payload.vm;

import com.firedome.ravello.Resource;

public class AddVmPayload extends Resource {

    private Long baseVmId;

    public Long getBaseVmId() {
        return baseVmId;
    }

    public void setBaseVmId(Long baseVmId) {
        this.baseVmId = baseVmId;
    }
}
