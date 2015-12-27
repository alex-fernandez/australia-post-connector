package org.mule.modules.australiapost;

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
import org.mule.modules.australiapost.model.Order;

import java.io.IOException;

@Connector(name = "australia-post", friendlyName = "Australia Post")
public class AustraliaPostConnector {

    @Config
    ConnectorConfig config;

    /**
     * Create Booking
     * <p/>
     * {@sample.xml ../../../doc/australia-post-connector.xml.sample australia-post:create-booking}
     *
     * @param credential Credential Details
     * @param order      Order Details
     * @return Booking Details
     *
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