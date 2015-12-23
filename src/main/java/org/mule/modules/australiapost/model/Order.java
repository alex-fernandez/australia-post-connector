package org.mule.modules.australiapost.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "order_id",
        "order_creation_date",
        "order_summary",
        "shipments"
})
public class Order {

    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("order_creation_date")
    private String orderCreationDate;
    @JsonProperty("order_summary")
    private OrderSummary orderSummary;
    @JsonProperty("shipments")
    private List<Shipment> shipments = new ArrayList<Shipment>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The orderId
     */
    @JsonProperty("order_id")
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId The order_id
     */
    @JsonProperty("order_id")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return The orderCreationDate
     */
    @JsonProperty("order_creation_date")
    public String getOrderCreationDate() {
        return orderCreationDate;
    }

    /**
     * @param orderCreationDate The order_creation_date
     */
    @JsonProperty("order_creation_date")
    public void setOrderCreationDate(String orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
    }

    /**
     * @return The orderSummary
     */
    @JsonProperty("order_summary")
    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    /**
     * @param orderSummary The order_summary
     */
    @JsonProperty("order_summary")
    public void setOrderSummary(OrderSummary orderSummary) {
        this.orderSummary = orderSummary;
    }

    /**
     * @return The shipments
     */
    @JsonProperty("shipments")
    public List<Shipment> getShipments() {
        return shipments;
    }

    /**
     * @param shipments The shipments
     */
    @JsonProperty("shipments")
    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}