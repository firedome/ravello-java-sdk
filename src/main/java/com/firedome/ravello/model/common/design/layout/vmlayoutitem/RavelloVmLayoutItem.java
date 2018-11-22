package com.firedome.ravello.model.common.design.layout.vmlayoutitem;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Vm Layout Item model
 */
public class RavelloVmLayoutItem extends Resource {

    private RavelloLocation location;
    private Long vmId;

    public RavelloLocation getLocation() {
        return location;
    }

    public void setLocation(RavelloLocation location) {
        this.location = location;
    }

    public Long getVmId() {
        return vmId;
    }

    public void setVmId(Long vmId) {
        this.vmId = vmId;
    }
}
