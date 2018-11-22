package com.firedome.ravello.model;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.RavelloOwnerDetails;
import com.firedome.ravello.model.common.design.RavelloDesign;

/**
 * Describes Ravello Blueprint model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#blueprints></a>
 *
 */
public class RavelloBlueprint extends Resource {

    private long id;
    private String name;
    private String owner;
    private RavelloOwnerDetails ownerDetails;
    private String description;
    private long creationTime;
    private boolean usingNewNetwork;
    private RavelloDesign design;
    private boolean published;
    private boolean isPublic;
    private int peerToPeerShares;
    private int communityShares;
    private int copies;
    private boolean hasDocumentation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = Boolean.parseBoolean(isPublic);
    }

    public int getPeerToPeerShares() {
        return peerToPeerShares;
    }

    public void setPeerToPeerShares(int peerToPeerShares) {
        this.peerToPeerShares = peerToPeerShares;
    }

    public int getCommunityShares() {
        return communityShares;
    }

    public void setCommunityShares(int communityShares) {
        this.communityShares = communityShares;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean isHasDocumentation() {
        return hasDocumentation;
    }

    public void setHasDocumentation(boolean hasDocumentation) {
        this.hasDocumentation = hasDocumentation;
    }
}
