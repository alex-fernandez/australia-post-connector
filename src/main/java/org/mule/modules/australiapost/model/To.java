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
        "lines",
        "suburb",
        "postcode",
        "state",
        "name",
        "business_name",
        "phone"
})
public class To {

    @JsonProperty("lines")
    private List<String> lines = new ArrayList<String>();
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("name")
    private String name;
    @JsonProperty("business_name")
    private String businessName;
    @JsonProperty("phone")
    private String phone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The lines
     */
    @JsonProperty("lines")
    public List<String> getLines() {
        return lines;
    }

    /**
     * @param lines The lines
     */
    @JsonProperty("lines")
    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    /**
     * @return The suburb
     */
    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    /**
     * @param suburb The suburb
     */
    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     * @return The postcode
     */
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode The postcode
     */
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The businessName
     */
    @JsonProperty("business_name")
    public String getBusinessName() {
        return businessName;
    }

    /**
     * @param businessName The business_name
     */
    @JsonProperty("business_name")
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * @return The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
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