package org.mule.modules.australiapost.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "shipment_id",
        "to",
        "shipment_summary"
})
public class Shipment {

    @JsonProperty("shipment_id")
    private String shipmentId;
    @JsonProperty("to")
    private To to;
    @JsonProperty("shipment_summary")
    private ShipmentSummary shipmentSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The shipmentId
     */
    @JsonProperty("shipment_id")
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * @param shipmentId The shipment_id
     */
    @JsonProperty("shipment_id")
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * @return The to
     */
    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    /**
     * @param to The to
     */
    @JsonProperty("to")
    public void setTo(To to) {
        this.to = to;
    }

    /**
     * @return The shipmentSummary
     */
    @JsonProperty("shipment_summary")
    public ShipmentSummary getShipmentSummary() {
        return shipmentSummary;
    }

    /**
     * @param shipmentSummary The shipment_summary
     */
    @JsonProperty("shipment_summary")
    public void setShipmentSummary(ShipmentSummary shipmentSummary) {
        this.shipmentSummary = shipmentSummary;
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