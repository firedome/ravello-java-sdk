package com.firedome.ravello.model;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.RavelloCostBucket;
import com.firedome.ravello.model.application.RavelloNextStopTask;
import com.firedome.ravello.model.application.deployment.RavelloDeployment;
import com.firedome.ravello.model.common.RavelloOwnerDetails;
import com.firedome.ravello.model.common.design.RavelloDesign;

/**
 * Describes Ravello Application model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#application-objects></a>
 */
public class RavelloApplication extends Resource {

    private Long id;
    private String name;
    private String owner;
    private RavelloOwnerDetails ownerDetails;
    private String description;
    private long creationTime;
    private boolean usingNewNetwork;
    private RavelloDesign design;
    private RavelloCostBucket costBucket;
    private long baseBlueprintId;
    private String blueprintName;
    private boolean designDiffersFromDeployment;
    private boolean published;
    private int version;
    private RavelloDeployment deployment;
    private RavelloNextStopTask nextStopTask;
    private long costBucketId;

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public RavelloOwnerDetails getOwnerDetails() {
        return ownerDetails;
    }

    public void setOwnerDetails(RavelloOwnerDetails ownerDetails) {
        this.ownerDetails = ownerDetails;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public boolean isUsingNewNetwork() {
        return usingNewNetwork;
    }

    public void setUsingNewNetwork(boolean usingNewNetwork) {
        this.usingNewNetwork = usingNewNetwork;
    }

    public RavelloDesign getDesign() {
        return design;
    }

    public void setDesign(RavelloDesign ravelloDesign) {
        this.design = ravelloDesign;
    }

    public RavelloCostBucket getCostBucket() {
        return costBucket;
    }

    public void setCostBucket(RavelloCostBucket costBucket) {
        this.costBucket = costBucket;
    }

    public long getBaseBlueprintId() {
        return baseBlueprintId;
    }

    public void setBaseBlueprintId(long baseBlueprintId) {
        this.baseBlueprintId = baseBlueprintId;
    }

    public String getBlueprintName() {
        return blueprintName;
    }

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    public boolean isDesignDiffersFromDeployment() {
        return designDiffersFromDeployment;
    }

    public void setDesignDiffersFromDeployment(boolean designDiffersFromDeployment) {
        this.designDiffersFromDeployment = designDiffersFromDeployment;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public RavelloDeployment getDeployment() {
        return deployment;
    }

    public void setDeployment(RavelloDeployment ravelloDeployment) {
        this.deployment = ravelloDeployment;
    }

    public RavelloNextStopTask getNextStopTask() {
        return nextStopTask;
    }

    public void setNextStopTask(RavelloNextStopTask nextStopTask) {
        this.nextStopTask = nextStopTask;
    }

    public long getCostBucketId() {
        return costBucketId;
    }

    public void setCostBucketId(long costBucketId) {
        this.costBucketId = costBucketId;
    }

}