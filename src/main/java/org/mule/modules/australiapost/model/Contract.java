
package org.mule.modules.australiapost.model;

import java.util.HashMap;
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
    "valid_from",
    "valid_to",
    "expired",
    "volumetric_pricing",
    "max_item_count",
    "cubing_factor"
})
public class Contract {

    @JsonProperty("valid_from")
    private String validFrom;
    @JsonProperty("valid_to")
    private String validTo;
    @JsonProperty("expired")
    private Boolean expired;
    @JsonProperty("volumetric_pricing")
    private Boolean volumetricPricing;
    @JsonProperty("max_item_count")
    private Integer maxItemCount;
    @JsonProperty("cubing_factor")
    private Integer cubingFactor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The validFrom
     */
    @JsonProperty("valid_from")
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * 
     * @param validFrom
     *     The valid_from
     */
    @JsonProperty("valid_from")
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public au.com.australiapost.model.Contract withValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * 
     * @return
     *     The validTo
     */
    @JsonProperty("valid_to")
    public String getValidTo() {
        return validTo;
    }

    /**
     * 
     * @param validTo
     *     The valid_to
     */
    @JsonProperty("valid_to")
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public au.com.australiapost.model.Contract withValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * 
     * @return
     *     The expired
     */
    @JsonProperty("expired")
    public Boolean getExpired() {
        return expired;
    }

    /**
     * 
     * @param expired
     *     The expired
     */
    @JsonProperty("expired")
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public au.com.australiapost.model.Contract withExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * 
     * @return
     *     The volumetricPricing
     */
    @JsonProperty("volumetric_pricing")
    public Boolean getVolumetricPricing() {
        return volumetricPricing;
    }

    /**
     * 
     * @param volumetricPricing
     *     The volumetric_pricing
     */
    @JsonProperty("volumetric_pricing")
    public void setVolumetricPricing(Boolean volumetricPricing) {
        this.volumetricPricing = volumetricPricing;
    }

    public au.com.australiapost.model.Contract withVolumetricPricing(Boolean volumetricPricing) {
        this.volumetricPricing = volumetricPricing;
        return this;
    }

    /**
     * 
     * @return
     *     The maxItemCount
     */
    @JsonProperty("max_item_count")
    public Integer getMaxItemCount() {
        return maxItemCount;
    }

    /**
     * 
     * @param maxItemCount
     *     The max_item_count
     */
    @JsonProperty("max_item_count")
    public void setMaxItemCount(Integer maxItemCount) {
        this.maxItemCount = maxItemCount;
    }

    public au.com.australiapost.model.Contract withMaxItemCount(Integer maxItemCount) {
        this.maxItemCount = maxItemCount;
        return this;
    }

    /**
     * 
     * @return
     *     The cubingFactor
     */
    @JsonProperty("cubing_factor")
    public Integer getCubingFactor() {
        return cubingFactor;
    }

    /**
     * 
     * @param cubingFactor
     *     The cubing_factor
     */
    @JsonProperty("cubing_factor")
    public void setCubingFactor(Integer cubingFactor) {
        this.cubingFactor = cubingFactor;
    }

    public au.com.australiapost.model.Contract withCubingFactor(Integer cubingFactor) {
        this.cubingFactor = cubingFactor;
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

    public au.com.australiapost.model.Contract withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("valid_from".equals(name)) {
            if (value instanceof String) {
                setValidFrom(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"valid_from\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("valid_to".equals(name)) {
                if (value instanceof String) {
                    setValidTo(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"valid_to\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("expired".equals(name)) {
                    if (value instanceof Boolean) {
                        setExpired(((Boolean) value));
                    } else {
                        throw new IllegalArgumentException(("property \"expired\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("volumetric_pricing".equals(name)) {
                        if (value instanceof Boolean) {
                            setVolumetricPricing(((Boolean) value));
                        } else {
                            throw new IllegalArgumentException(("property \"volumetric_pricing\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("max_item_count".equals(name)) {
                            if (value instanceof Integer) {
                                setMaxItemCount(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"max_item_count\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("cubing_factor".equals(name)) {
                                if (value instanceof Integer) {
                                    setCubingFactor(((Integer) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"cubing_factor\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
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
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("valid_from".equals(name)) {
            return getValidFrom();
        } else {
            if ("valid_to".equals(name)) {
                return getValidTo();
            } else {
                if ("expired".equals(name)) {
                    return getExpired();
                } else {
                    if ("volumetric_pricing".equals(name)) {
                        return getVolumetricPricing();
                    } else {
                        if ("max_item_count".equals(name)) {
                            return getMaxItemCount();
                        } else {
                            if ("cubing_factor".equals(name)) {
                                return getCubingFactor();
                            } else {
                                return notFoundValue;
                            }
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
        Object value = declaredPropertyOrNotFound(name, au.com.australiapost.model.Contract.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.Contract.NOT_FOUND_VALUE!= value) {
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
    public au.com.australiapost.model.Contract with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(validFrom).append(validTo).append(expired).append(volumetricPricing).append(maxItemCount).append(cubingFactor).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.Contract) == false) {
            return false;
        }
        au.com.australiapost.model.Contract rhs = ((au.com.australiapost.model.Contract) other);
        return new EqualsBuilder().append(validFrom, rhs.validFrom).append(validTo, rhs.validTo).append(expired, rhs.expired).append(volumetricPricing, rhs.volumetricPricing).append(maxItemCount, rhs.maxItemCount).append(cubingFactor, rhs.cubingFactor).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
