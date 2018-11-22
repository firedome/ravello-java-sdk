package com.firedome.ravello.payload.vm;

import com.firedome.ravello.Resource;
import com.firedome.ravello.payload.vm.harddrive.HardDrivePayload;
import com.firedome.ravello.payload.vm.networkconnection.NetworkConnectionPayload;

import java.util.ArrayList;
import java.util.List;

public class UpdateVmPayload extends Resource {

    private Long id; /* REQUIRED */
    private String name;
    private String description;
    private Long creationTime;
    private MemorySizePayload memorySize;
    private Integer numCpus;
    private String platform;
    private String os;
    private Double rcu;
    private Boolean supportsCloudInit;
    private Boolean requiresKeypair;
    private Boolean useCdn;
    private Boolean privateCloudImage;
    private List<String> hostnames = new ArrayList<>();
    private Long applicationId; /* REQUIRED */
    private Boolean legacyMode;
    private String loadingStatus;
    private Integer loadingPercentage;
    private Long baseVmId;
    private Boolean allowNested;
    private List<SuppliedServicePayload> suppliedServices = new ArrayList<>();
    private List<RequiredServicesPayload> requiredServices = new ArrayList<>();
    private List<NetworkConnectionPayload> networkConnections = new ArrayList<>();
    private List<HardDrivePayload> hardDrives = new ArrayList<>();
    private List<String> bootOrder = new ArrayList<>();
    private Boolean powerOffOnStopTimeOut;
    private Boolean usingNewNetwork;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public MemorySizePayload getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(MemorySizePayload memorySize) {
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

    public List<String> getHostnames() {
        return hostnames;
    }

    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
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

    public List<SuppliedServicePayload> getSuppliedServices() {
        return suppliedServices;
    }

    public void setSuppliedServices(List<SuppliedServicePayload> suppliedServices) {
        this.suppliedServices = suppliedServices;
    }

    public List<RequiredServicesPayload> getRequiredServices() {
        return requiredServices;
    }

    public void setRequiredServices(List<RequiredServicesPayload> requiredServices) {
        this.requiredServices = requiredServices;
    }

    public List<NetworkConnectionPayload> getNetworkConnections() {
        return networkConnections;
    }

    public void setNetworkConnections(List<NetworkConnectionPayload> networkConnections) {
        this.networkConnections = networkConnections;
    }

    public List<HardDrivePayload> getHardDrives() {
        return hardDrives;
    }

    public void setHardDrives(List<HardDrivePayload> hardDrives) {
        this.hardDrives = hardDrives;
    }

    public List<String> getBootOrder() {
        return bootOrder;
    }

    public void setBootOrder(List<String> bootOrder) {
        this.bootOrder = bootOrder;
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

    public Boolean getRequiresHvm() {
        return requiresHvm;
    }

    public void setRequiresHvm(Boolean requiresHvm) {
        this.requiresHvm = requiresHvm;
    }
}
