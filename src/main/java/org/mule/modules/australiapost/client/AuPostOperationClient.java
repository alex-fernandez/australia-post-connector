package org.mule.modules.australiapost.client;

import au.com.australiapost.model.Order;
import org.mule.api.ConnectionException;
import org.mule.modules.australiapost.config.ConnectorConfig;
import org.mule.modules.australiapost.model.BookingResponse;
import org.mule.modules.australiapost.model.Credential;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class AuPostOperationClient extends AbstractOperationClient {

    private static final Logger log = LoggerFactory.getLogger(AuPostOperationClient.class);

    private static String ORDER_API = "/orders";
    public AuPostOperationClient(ConnectorConfig connectorConfig) throws ConnectionException {
        super(connectorConfig);
    }

    public BookingResponse createBooking(Credential credential, Order order) throws ConnectionException {
        overrideCredentialSettings(credential);
        Response response = post(ORDER_API, Entity.entity(order, MediaType.APPLICATION_JSON));
        evaluateResponse(response);
        return response.readEntity(BookingResponse.class);
    }

}
