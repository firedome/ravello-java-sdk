package com.firedome.ravello.payload.network;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.dhcpserver.assignedipentry.RavelloAssignedIpEntry;
import com.firedome.ravello.model.application.network.service.dhcpserver.excludedipentry.RavelloExcludedIpEntry;
import com.firedome.ravello.model.application.network.service.dhcpserver.reservedipentry.RavelloReservedIpEntry;

import java.util.List;

public class CreateDhcpServerPayload extends Resource {

    private String name;
    private long ipConfigurationId;
    private long gatewayIpConfigurationId;
    private long dnsIpConfigurationId;
    private String mask;
    private String poolStart;
    private String poolEnd;
    private List<RavelloExcludedIpEntry> excludedIpEntries;
    private List<RavelloReservedIpEntry> reservedIpEntries;
    private List<RavelloAssignedIpEntry> assignedIpEntries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIpConfigurationId() {
        return ipConfigurationId;
    }

    public void setIpConfigurationId(long ipConfigurationId) {
        this.ipConfigurationId = ipConfigurationId;
    }

    public long getGatewayIpConfigurationId() {
        return gatewayIpConfigurationId;
    }

    public void setGatewayIpConfigurationId(long gatewayIpConfigurationId) {
        this.gatewayIpConfigurationId = gatewayIpConfigurationId;
    }

    public long getDnsIpConfigurationId() {
        return dnsIpConfigurationId;
    }

    public void setDnsIpConfigurationId(long dnsIpConfigurationId) {
        this.dnsIpConfigurationId = dnsIpConfigurationId;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getPoolStart() {
        return poolStart;
    }

    public void setPoolStart(String poolStart) {
        this.poolStart = poolStart;
    }

    public String getPoolEnd() {
        return poolEnd;
    }

    public void setPoolEnd(String poolEnd) {
        this.poolEnd = poolEnd;
    }

    public List<RavelloExcludedIpEntry> getExcludedIpEntries() {
        return excludedIpEntries;
    }

    public void setExcludedIpEntries(List<RavelloExcludedIpEntry> excludedIpEntries) {
        this.excludedIpEntries = excludedIpEntries;
    }

    public List<RavelloReservedIpEntry> getReservedIpEntries() {
        return reservedIpEntries;
    }

    public void setReservedIpEntries(List<RavelloReservedIpEntry> reservedIpEntries) {
        this.reservedIpEntries = reservedIpEntries;
    }

    public List<RavelloAssignedIpEntry> getAssignedIpEntries() {
        return assignedIpEntries;
    }

    public void setAssignedIpEntries(List<RavelloAssignedIpEntry> assignedIpEntries) {
        this.assignedIpEntries = assignedIpEntries;
    }
}
