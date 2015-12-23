package org.mule.modules.australiapost.model;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "total_cost",
        "total_gst",
        "status",
        "tracking_summary",
        "number_of_shipments"
})
public class OrderSummary {

    @JsonProperty("total_cost")
    private Double totalCost;
    @JsonProperty("total_gst")
    private Double totalGst;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tracking_summary")
    private TrackingSummary trackingSummary;
    @JsonProperty("number_of_shipments")
    private Integer numberOfShipments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The totalCost
     */
    @JsonProperty("total_cost")
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost The total_cost
     */
    @JsonProperty("total_cost")
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * @return The totalGst
     */
    @JsonProperty("total_gst")
    public Double getTotalGst() {
        return totalGst;
    }

    /**
     * @param totalGst The total_gst
     */
    @JsonProperty("total_gst")
    public void setTotalGst(Double totalGst) {
        this.totalGst = totalGst;
    }

    /**
     * @return The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The trackingSummary
     */
    @JsonProperty("tracking_summary")
    public TrackingSummary getTrackingSummary() {
        return trackingSummary;
    }

    /**
     * @param trackingSummary The tracking_summary
     */
    @JsonProperty("tracking_summary")
    public void setTrackingSummary(TrackingSummary trackingSummary) {
        this.trackingSummary = trackingSummary;
    }

    /**
     * @return The numberOfShipments
     */
    @JsonProperty("number_of_shipments")
    public Integer getNumberOfShipments() {
        return numberOfShipments;
    }

    /**
     * @param numberOfShipments The number_of_shipments
     */
    @JsonProperty("number_of_shipments")
    public void setNumberOfShipments(Integer numberOfShipments) {
        this.numberOfShipments = numberOfShipments;
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