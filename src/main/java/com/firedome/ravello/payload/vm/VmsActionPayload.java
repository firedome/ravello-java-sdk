package com.firedome.ravello.payload.vm;

import com.firedome.ravello.Resource;

import java.util.ArrayList;
import java.util.List;

public class VmsActionPayload extends Resource {
    private List<Long> ids = new ArrayList<>();

    /**
     *  @see VmActionTypes
     */
    private VmActionTypes actionType;

    public VmsActionPayload(){}

    public VmsActionPayload(List<Long> ids, VmActionTypes actionType) {
        this.ids = ids;
        this.actionType = actionType;
    }

    public void addId(Long id){
        ids.add(id);
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public VmActionTypes getActionType() {
        return actionType;
    }

    public void setActionType(VmActionTypes actionType) {
        this.actionType = actionType;
    }
}
