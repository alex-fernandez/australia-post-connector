
package org.mule.modules.australiapost.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "lines",
    "suburb",
    "postcode",
    "state"
})
public class Address {

    @JsonProperty("type")
    private String type;
    @JsonProperty("lines")
    private List<String> lines = new ArrayList<String>();
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public au.com.australiapost.model.Address withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The lines
     */
    @JsonProperty("lines")
    public List<String> getLines() {
        return lines;
    }

    /**
     * 
     * @param lines
     *     The lines
     */
    @JsonProperty("lines")
    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public au.com.australiapost.model.Address withLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * 
     * @return
     *     The suburb
     */
    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    /**
     * 
     * @param suburb
     *     The suburb
     */
    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public au.com.australiapost.model.Address withSuburb(String suburb) {
        this.suburb = suburb;
        return this;
    }

    /**
     * 
     * @return
     *     The postcode
     */
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    /**
     * 
     * @param postcode
     *     The postcode
     */
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public au.com.australiapost.model.Address withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public au.com.australiapost.model.Address withState(String state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public au.com.australiapost.model.Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("type".equals(name)) {
            if (value instanceof String) {
                setType(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"type\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("lines".equals(name)) {
                if (value instanceof List) {
                    setLines(((List<String> ) value));
                } else {
                    throw new IllegalArgumentException(("property \"lines\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("suburb".equals(name)) {
                    if (value instanceof String) {
                        setSuburb(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"suburb\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("postcode".equals(name)) {
                        if (value instanceof String) {
                            setPostcode(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"postcode\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("state".equals(name)) {
                            if (value instanceof String) {
                                setState(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"state\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("type".equals(name)) {
            return getType();
        } else {
            if ("lines".equals(name)) {
                return getLines();
            } else {
                if ("suburb".equals(name)) {
                    return getSuburb();
                } else {
                    if ("postcode".equals(name)) {
                        return getPostcode();
                    } else {
                        if ("state".equals(name)) {
                            return getState();
                        } else {
                            return notFoundValue;
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, au.com.australiapost.model.Address.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.Address.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            return ((T) getAdditionalProperties().get(name));
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public au.com.australiapost.model.Address with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(lines).append(suburb).append(postcode).append(state).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.Address) == false) {
            return false;
        }
        au.com.australiapost.model.Address rhs = ((au.com.australiapost.model.Address) other);
        return new EqualsBuilder().append(type, rhs.type).append(lines, rhs.lines).append(suburb, rhs.suburb).append(postcode, rhs.postcode).append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
