package org.mule.modules.australiapost.client;

import org.mule.api.ConnectionException;
import org.mule.modules.australiapost.config.ConnectorConfig;
import org.mule.modules.australiapost.model.BookingResponse;
import org.mule.modules.australiapost.model.Credential;
import org.mule.modules.australiapost.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


public class AuPostOperationClient extends AbstractOperationClient {

    private static final Logger log = LoggerFactory.getLogger(AuPostOperationClient.class);

    private static final String ORDER_API = "/orders";
    private static final String SHIPMENT_API = "/shipments";
    private static final String LABEL_API = "/labels";

    public AuPostOperationClient(ConnectorConfig connectorConfig) throws ConnectionException {
        super(connectorConfig);
    }

    public BookingResponse createBooking(Credential credential, Order order) throws ConnectionException {
        overrideCredentialSettings(credential);
        Response response = post(ORDER_API, Entity.entity(order, MediaType.APPLICATION_JSON));
        evaluateResponse(response);
        return response.readEntity(BookingResponse.class);
    }

    public BookingResponse getBookingDetails(Credential credential, String orderId) throws ConnectionException {
        overrideCredentialSettings(credential);
        Response response = get(ORDER_API + "/" + orderId);
        evaluateResponse(response);
        return response.readEntity(BookingResponse.class);
    }

    public BookingResponse getShipmentDetails(Credential credential, String shipmentId) throws ConnectionException {
        overrideCredentialSettings(credential);
        Response response = get(SHIPMENT_API + "/" + shipmentId);
        evaluateResponse(response);
        return response.readEntity(BookingResponse.class);
    }


    public List<String> createLabel(Credential credential, List<String> shipments) throws ConnectionException {
        overrideCredentialSettings(credential);
        Response response = post(LABEL_API, Entity.entity(shipments, MediaType.APPLICATION_JSON));
        evaluateResponse(response);
        return response.readEntity(List.class);
    }
}
