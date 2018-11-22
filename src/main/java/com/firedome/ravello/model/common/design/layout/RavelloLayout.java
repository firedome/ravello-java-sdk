package com.firedome.ravello.model.common.design.layout;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.design.layout.vmlayoutitem.RavelloVmLayoutItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes Ravello Layout model
 */
public class RavelloLayout extends Resource {

    private List<RavelloVmLayoutItem> vmLayoutItem = new ArrayList<>();

    public List<RavelloVmLayoutItem> getVmLayoutItem() {
        return vmLayoutItem;
    }

    public void setVmLayoutItem(List<RavelloVmLayoutItem> ravelloVmLayoutItem) {
        this.vmLayoutItem = ravelloVmLayoutItem;
    }
}
