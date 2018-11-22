package com.firedome.ravello.model;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.common.vm.RavelloMemorySize;
import com.firedome.ravello.model.common.vm.harddrive.RavelloHardDrive;
import com.firedome.ravello.model.common.vm.networkconnection.RavelloNetworkConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes Ravello Image model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#vm-properties></a>
 */
public class RavelloImage extends Resource {

    private Long id;
    private String name;
    private Long creationTime;
    private RavelloMemorySize memorySize;
    private Integer numCpus;
    private String platform;
    private String os;
    private Double rcu;
    private Boolean supportsCloudInit;
    private Boolean requiresKeypair;
    private Boolean useCdn;
    private Boolean privateCloudImage;
    private Boolean legacyMode;
    private String loadingStatus;
    private Integer loadingPercentage;
    private Long baseVmId;
    private Boolean allowNested;
    private List<RavelloNetworkConnection> networkConnections = new ArrayList<>();
    private List<RavelloHardDrive> hardDrives = new ArrayList<>();
    private Object busStructure;
    private List<String> bootOrder = new ArrayList<>();
    private Boolean powerOffOnStopTimeOut;
    private Boolean usingNewNetwork;
    private String bootType;
    private Boolean importedByUser;
    private Boolean isPublic;
    private String owner;
    private RavelloOwnerDetails ownerDetails;
    private Long peerToPeerShares;
    private Long communityShares;
    private Long copies;
    private Boolean hasDocumentation;
    private Boolean requiresHvm;

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

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public RavelloMemorySize getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(RavelloMemorySize memorySize) {
        this.memorySize = memorySize;
    }

    public Integer getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(Integer numCpus) {
        this.numCpus = numCpus;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Double getRcu() {
        return rcu;
    }

    public void setRcu(Double rcu) {
        this.rcu = rcu;
    }

    public Boolean getSupportsCloudInit() {
        return supportsCloudInit;
    }

    public void setSupportsCloudInit(Boolean supportsCloudInit) {
        this.supportsCloudInit = supportsCloudInit;
    }

    public Boolean getRequiresKeypair() {
        return requiresKeypair;
    }

    public void setRequiresKeypair(Boolean requiresKeypair) {
        this.requiresKeypair = requiresKeypair;
    }

    public Boolean getUseCdn() {
        return useCdn;
    }

    public void setUseCdn(Boolean useCdn) {
        this.useCdn = useCdn;
    }

    public Boolean getPrivateCloudImage() {
        return privateCloudImage;
    }

    public void setPrivateCloudImage(Boolean privateCloudImage) {
        this.privateCloudImage = privateCloudImage;
    }

    public Boolean getLegacyMode() {
        return legacyMode;
    }

    public void setLegacyMode(Boolean legacyMode) {
        this.legacyMode = legacyMode;
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

    public Long getBaseVmId() {
        return baseVmId;
    }

    public void setBaseVmId(Long baseVmId) {
        this.baseVmId = baseVmId;
    }

    public Boolean getAllowNested() {
        return allowNested;
    }

    public void setAllowNested(Boolean allowNested) {
        this.allowNested = allowNested;
    }

    public List<RavelloNetworkConnection> getNetworkConnections() {
        return networkConnections;
    }

    public void setNetworkConnections(List<RavelloNetworkConnection> networkConnections) {
        this.networkConnections = networkConnections;
    }

    public List<RavelloHardDrive> getHardDrives() {
        return hardDrives;
    }

    public void setHardDrives(List<RavelloHardDrive> hardDrives) {
        this.hardDrives = hardDrives;
    }

    public Object getBusStructure() {
        return busStructure;
    }

    public void setBusStructure(Object busStructure) {
        this.busStructure = busStructure;
    }

    public List<String> getBootOrder() {
        return bootOrder;
    }

    public Boolean getPowerOffOnStopTimeOut() {
        return powerOffOnStopTimeOut;
    }

    public void setPowerOffOnStopTimeOut(Boolean powerOffOnStopTimeOut) {
        this.powerOffOnStopTimeOut = powerOffOnStopTimeOut;
    }

    public Boolean getUsingNewNetwork() {
        return usingNewNetwork;
    }

    public void setUsingNewNetwork(Boolean usingNewNetwork) {
        this.usingNewNetwork = usingNewNetwork;
    }

    public Boolean getImportedByUser() {
        return importedByUser;
    }

    public void setImportedByUser(Boolean importedByUser) {
        this.importedByUser = importedByUser;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
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

    public Long getPeerToPeerShares() {
        return peerToPeerShares;
    }

    public void setPeerToPeerShares(Long peerToPeerShares) {
        this.peerToPeerShares = peerToPeerShares;
    }

    public Long getCommunityShares() {
        return communityShares;
    }

    public void setCommunityShares(Long communityShares) {
        this.communityShares = communityShares;
    }

    public Long getCopies() {
        return copies;
    }

    public void setCopies(Long copies) {
        this.copies = copies;
    }

    public Boolean getHasDocumentation() {
        return hasDocumentation;
    }

    public void setHasDocumentation(Boolean hasDocumentation) {
        this.hasDocumentation = hasDocumentation;
    }

    public Boolean getRequiresHvm() {
        return requiresHvm;
    }

    public void setRequiresHvm(Boolean requiresHvm) {
        this.requiresHvm = requiresHvm;
    }

    public String getBootType() {
        return bootType;
    }

    public void setBootType(String bootType) {
        this.bootType = bootType;
    }
}
