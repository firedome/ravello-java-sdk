package com.firedome.ravello.model.application.deployment;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.deployment.cloudregion.RavelloCloudRegion;
import com.firedome.ravello.model.application.network.RavelloNetwork;
import com.firedome.ravello.model.common.vm.RavelloVm;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes Ravello Deployment model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#deployment-properties></a>
 */
public class RavelloDeployment extends Resource {

    private String cloud;
    private String cloudId;

    private String regionName;
    private String regionId;

    private Integer totalActiveVms;
    private Integer totalStoppedVms;
    private Integer totalErrorVms;

    private long publishStartTime;
    private String publishOptimization;

    private String expirationType;

    private List<RavelloVm> vms = new ArrayList<>();

    private RavelloNetwork network;

    private boolean stopVmsByOrder;

    private RavelloCloudRegion cloudRegion;

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getCloudId() {
        return cloudId;
    }

    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Integer getTotalActiveVms() {
        return totalActiveVms;
    }

    public void setTotalActiveVms(Integer totalActiveVms) {
        this.totalActiveVms = totalActiveVms;
    }

    public RavelloNetwork getNetwork() {
        return network;
    }

    public void setNetwork(RavelloNetwork ravelloNetwork) {
        this.network = ravelloNetwork;
    }

    public Integer getTotalStoppedVms() {
        return totalStoppedVms;
    }

    public void setTotalStoppedVms(Integer totalStoppedVms) {
        this.totalStoppedVms = totalStoppedVms;
    }

    public Integer getTotalErrorVms() {
        return totalErrorVms;
    }

    public void setTotalErrorVms(Integer totalErrorVms) {
        this.totalErrorVms = totalErrorVms;
    }

    public long getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(long publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public String getPublishOptimization() {
        return publishOptimization;
    }

    public void setPublishOptimization(String publishOptimization) {
        this.publishOptimization = publishOptimization;
    }

    public String getExpirationType() {
        return expirationType;
    }

    public void setExpirationType(String expirationType) {
        this.expirationType = expirationType;
    }

    public List<RavelloVm> getVms() {
        return vms;
    }

    public void setVms(List<RavelloVm> ravelloVms) {
        this.vms = ravelloVms;
    }

    public boolean isStopVmsByOrder() {
        return stopVmsByOrder;
    }

    public void setStopVmsByOrder(boolean stopVmsByOrder) {
        this.stopVmsByOrder = stopVmsByOrder;
    }

    public RavelloCloudRegion getCloudRegion() {
        return cloudRegion;
    }

    public void setCloudRegion(RavelloCloudRegion ravelloCloudRegion) {
        this.cloudRegion = ravelloCloudRegion;
    }
}
