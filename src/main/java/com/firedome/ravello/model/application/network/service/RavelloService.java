package com.firedome.ravello.model.application.network.service;

import com.firedome.ravello.Resource;
import com.firedome.ravello.model.application.network.service.dhcpserver.RavelloDhcpServer;
import com.firedome.ravello.model.application.network.service.dnsserver.RavelloDnsServer;
import com.firedome.ravello.model.application.network.service.externalgateway.RavelloExternalGateway;
import com.firedome.ravello.model.application.network.service.networkinterface.RavelloNetworkInterface;
import com.firedome.ravello.model.application.network.service.router.RavelloRouter;

import java.util.List;

/**
 * Describes Ravello Service model
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#services-inner-objects></a>
 */
public class RavelloService extends Resource {

    private List<RavelloDhcpServer> dhcpServers;
    private List<RavelloDnsServer> dnsServers;
    private List<RavelloRouter> routers;
    private RavelloExternalGateway externalGateway;
    private List<RavelloNetworkInterface> networkInterfaces;

    public List<RavelloDhcpServer> getDhcpServers() {
        return dhcpServers;
    }

    public void setDhcpServers(List<RavelloDhcpServer> dhcpServers) {
        this.dhcpServers = dhcpServers;
    }

    public List<RavelloDnsServer> getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(List<RavelloDnsServer> dnsServers) {
        this.dnsServers = dnsServers;
    }

    public List<RavelloRouter> getRouters() {
        return routers;
    }

    public void setRouters(List<RavelloRouter> routers) {
        this.routers = routers;
    }

    public RavelloExternalGateway getExternalGateway() {
        return externalGateway;
    }

    public void setExternalGateway(RavelloExternalGateway externalGateway) {
        this.externalGateway = externalGateway;
    }

    public List<RavelloNetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(List<RavelloNetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }
}
