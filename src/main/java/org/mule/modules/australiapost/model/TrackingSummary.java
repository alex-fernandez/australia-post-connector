package org.mule.modules.australiapost.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "Initiated"
})
public class TrackingSummary {

    @JsonProperty("Initiated")
    private Integer Initiated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The Initiated
     */
    @JsonProperty("Initiated")
    public Integer getInitiated() {
        return Initiated;
    }

    /**
     * @param Initiated The Initiated
     */
    @JsonProperty("Initiated")
    public void setInitiated(Integer Initiated) {
        this.Initiated = Initiated;
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