package com.firedome.ravello.model.common.design;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.RavelloNetwork;
import com.firedome.ravello.model.common.design.layout.RavelloLayout;
import com.firedome.ravello.model.common.vm.RavelloVm;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes Ravello Design model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#design-properties></a>
 */
public class RavelloDesign extends Resource {

    private String state;
    private List<RavelloVm> vms = new ArrayList<>();
    private RavelloNetwork network;
    private RavelloLayout layout;
    private RavelloVmOrderGroups vmOrderGroups;
    private Boolean stopVmsByOrder;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<RavelloVm> getVms() {
        return vms;
    }

    public void setVms(List<RavelloVm> ravelloVms) {
        this.vms = ravelloVms;
    }

    public RavelloNetwork getNetwork() {
        return network;
    }

    public void setNetwork(RavelloNetwork ravelloNetwork) {
        this.network = ravelloNetwork;
    }

    public RavelloLayout getLayout() {
        return layout;
    }

    public void setLayout(RavelloLayout ravelloLayout) {
        this.layout = ravelloLayout;
    }

    public RavelloVmOrderGroups getVmOrderGroups() {
        return vmOrderGroups;
    }

    public void setVmOrderGroups(RavelloVmOrderGroups vmOrderGroups) {
        this.vmOrderGroups = vmOrderGroups;
    }

    public Boolean isStopVmsByOrder() {
        return stopVmsByOrder;
    }

    public void setStopVmsByOrder(boolean stopVmsByOrder) {
        this.stopVmsByOrder = stopVmsByOrder;
    }
}
