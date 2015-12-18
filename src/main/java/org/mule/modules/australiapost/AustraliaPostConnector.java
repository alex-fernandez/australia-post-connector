package org.mule.modules.australiapost;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import java.io.IOException;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.rest.HttpMethod;
import org.mule.api.annotations.rest.RestCall;
import org.mule.api.annotations.rest.RestUriParam;

import org.mule.modules.australiapost.config.ConnectorConfig;

@Connector(name="australia-post", friendlyName="AustraliaPost")
public abstract class AustraliaPostConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * {@sample.xml ../../../doc/australia-post-connector.xml.sample australia-post:greet}
     *
     * @param friend Name of a friend we want to greet
     * @return The greeting and reply to the selected friend.
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    @RestCall(uri="https://myapiurl/{friend}", method=HttpMethod.GET)
    public abstract void greet(@RestUriParam("friend") String friend) throws IOException;  

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}