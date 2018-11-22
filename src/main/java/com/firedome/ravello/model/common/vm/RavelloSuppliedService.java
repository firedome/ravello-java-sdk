package com.firedome.ravello.model.common.vm;

import com.firedome.ravello.Resource;

/**
 * Describes Ravello Supplied Service model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#extra-properties-for-supplied-service></a>
 */
public class RavelloSuppliedService extends Resource {

    private Long id;
    private String name;
    private String portRange;
    private String protocol;
    private Boolean external;
    private String externalPort;
    private Long ipConfigLuid;
    private Boolean useLuidForIpConfig;

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

    public String getPortRange() {
        return portRange;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getExternalPort() {
        return externalPort;
    }

    public void setExternalPort(String externalPort) {
        this.externalPort = externalPort;
    }

    public Long getIpConfigLuid() {
        return ipConfigLuid;
    }

    public void setIpConfigLuid(Long ipConfigLuid) {
        this.ipConfigLuid = ipConfigLuid;
    }

    public Boolean getUseLuidForIpConfig() {
        return useLuidForIpConfig;
    }

    public void setUseLuidForIpConfig(Boolean useLuidForIpConfig) {
        this.useLuidForIpConfig = useLuidForIpConfig;
    }
}
