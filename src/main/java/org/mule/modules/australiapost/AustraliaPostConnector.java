package org.mule.modules.australiapost;

import au.com.australiapost.model.Order;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.australiapost.config.ConnectorConfig;
import org.mule.modules.australiapost.model.BookingResponse;
import org.mule.modules.australiapost.model.Credential;

import java.io.IOException;

@Connector(name = "australia-post", friendlyName = "Australia Post")
public class AustraliaPostConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     * <p/>
     * {@sample.xml ../../../doc/australia-post-connector.xml.sample australia-post:create-booking}
     *
     * @param friend Name of a friend we want to greet
     * @return The greeting and reply to the selected friend.
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = {Exception.class})
    public BookingResponse createBooking(@Placement(group = "Override Credential Settings", order = 1) @Optional Credential credential,
                              @Placement(group = "Booking request", order = 2) Order order) throws ConnectionException {
       return config.getAuPostOperationClient().createBooking(credential, order);
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}