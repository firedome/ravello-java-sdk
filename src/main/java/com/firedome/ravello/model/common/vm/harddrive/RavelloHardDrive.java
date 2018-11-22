package com.firedome.ravello.model.common.vm.harddrive;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Hard Drive model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#hard-drive-properties-no-inner-objects></a>
 */
public class RavelloHardDrive extends Resource {

    private Long id;
    private String name;
    private Boolean boot;
    private RavelloSize size;
    private Integer index;
    private String type;
    private String imageFetchMode;
    private RavelloBiosGeometry biosGeometry;
    private String controller;
    private Integer controllerIndex;
    private Integer controllerPciSlot;
    private long controllerId;
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

    public RavelloSize getSize() {
        return size;
    }

    public void setSize(RavelloSize size) {
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

    public RavelloBiosGeometry getBiosGeometry() {
        return biosGeometry;
    }

    public void setBiosGeometry(RavelloBiosGeometry biosGeometry) {
        this.biosGeometry = biosGeometry;
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

    public Integer getControllerPciSlot() {
        return controllerPciSlot;
    }

    public void setControllerPciSlot(Integer controllerPciSlot) {
        this.controllerPciSlot = controllerPciSlot;
    }

    public long getControllerId() {
        return controllerId;
    }

    public void setControllerId(long controllerId) {
        this.controllerId = controllerId;
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

    public void setLoadingPercentage(String loadingPercentage) {
        this.loadingPercentage = Integer.parseInt(loadingPercentage);
    }
}
