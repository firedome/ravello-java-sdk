package com.firedome.ravello.model.common.vm;

import com.firedome.ravello.Resource;
/**
 * Describes Ravello Configuration Management model
 */
public class RavelloConfigurationManagement extends Resource {

    private Boolean configNetworkUsingCloudInit;

    public Boolean isConfigNetworkUsingCloudInit() {
        return configNetworkUsingCloudInit;
    }

    public void setConfigNetworkUsingCloudInit(boolean configNetworkUsingCloudInit) {
        this.configNetworkUsingCloudInit = configNetworkUsingCloudInit;
    }
}
