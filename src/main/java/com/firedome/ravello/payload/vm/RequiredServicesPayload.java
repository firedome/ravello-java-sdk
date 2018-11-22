package com.firedome.ravello.payload.vm;

import com.firedome.ravello.Resource;

public class RequiredServicesPayload extends Resource {

    private long id;
    private String name;
    private String protocol;
    private Boolean external;

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
}
