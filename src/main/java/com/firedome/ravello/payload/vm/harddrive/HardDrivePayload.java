package com.firedome.ravello.payload.vm.harddrive;

import com.firedome.ravello.Resource;

public class HardDrivePayload extends Resource {

    private Long id;
    private String name;
    private Boolean boot;
    private SizePayload size;
    private Integer index;
    private String type;
    private String imageFetchMode;
    private String controller;
    private Integer controllerIndex;
    private String loadingStatus;
    private Integer loadingPercentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBoot() {
        return boot;
    }

    public void setBoot(Boolean boot) {
        this.boot = boot;
    }

    public SizePayload getSize() {
        return size;
    }

    public void setSize(SizePayload size) {
        this.size = size;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageFetchMode() {
        return imageFetchMode;
    }

    public void setImageFetchMode(String imageFetchMode) {
        this.imageFetchMode = imageFetchMode;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public Integer getControllerIndex() {
        return controllerIndex;
    }

    public void setControllerIndex(Integer controllerIndex) {
        this.controllerIndex = controllerIndex;
    }

    public String getLoadingStatus() {
        return loadingStatus;
    }

    public void setLoadingStatus(String loadingStatus) {
        this.loadingStatus = loadingStatus;
    }

    public Integer getLoadingPercentage() {
        return loadingPercentage;
    }

    public void setLoadingPercentage(Integer loadingPercentage) {
        this.loadingPercentage = loadingPercentage;
    }
}
