
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
    "signature_on_delivery_option",
    "authority_to_leave_option"
})
public class Options {

    @JsonProperty("signature_on_delivery_option")
    private Boolean signatureOnDeliveryOption;
    @JsonProperty("authority_to_leave_option")
    private Boolean authorityToLeaveOption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The signatureOnDeliveryOption
     */
    @JsonProperty("signature_on_delivery_option")
    public Boolean getSignatureOnDeliveryOption() {
        return signatureOnDeliveryOption;
    }

    /**
     * 
     * @param signatureOnDeliveryOption
     *     The signature_on_delivery_option
     */
    @JsonProperty("signature_on_delivery_option")
    public void setSignatureOnDeliveryOption(Boolean signatureOnDeliveryOption) {
        this.signatureOnDeliveryOption = signatureOnDeliveryOption;
    }

    public Options withSignatureOnDeliveryOption(Boolean signatureOnDeliveryOption) {
        this.signatureOnDeliveryOption = signatureOnDeliveryOption;
        return this;
    }

    /**
     * 
     * @return
     *     The authorityToLeaveOption
     */
    @JsonProperty("authority_to_leave_option")
    public Boolean getAuthorityToLeaveOption() {
        return authorityToLeaveOption;
    }

    /**
     * 
     * @param authorityToLeaveOption
     *     The authority_to_leave_option
     */
    @JsonProperty("authority_to_leave_option")
    public void setAuthorityToLeaveOption(Boolean authorityToLeaveOption) {
        this.authorityToLeaveOption = authorityToLeaveOption;
    }

    public Options withAuthorityToLeaveOption(Boolean authorityToLeaveOption) {
        this.authorityToLeaveOption = authorityToLeaveOption;
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

    public Options withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("signature_on_delivery_option".equals(name)) {
            if (value instanceof Boolean) {
                setSignatureOnDeliveryOption(((Boolean) value));
            } else {
                throw new IllegalArgumentException(("property \"signature_on_delivery_option\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("authority_to_leave_option".equals(name)) {
                if (value instanceof Boolean) {
                    setAuthorityToLeaveOption(((Boolean) value));
                } else {
                    throw new IllegalArgumentException(("property \"authority_to_leave_option\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("signature_on_delivery_option".equals(name)) {
            return getSignatureOnDeliveryOption();
        } else {
            if ("authority_to_leave_option".equals(name)) {
                return getAuthorityToLeaveOption();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Options.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.Options.NOT_FOUND_VALUE!= value) {
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
    public au.com.australiapost.model.Options with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(signatureOnDeliveryOption).append(authorityToLeaveOption).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.Options) == false) {
            return false;
        }
        au.com.australiapost.model.Options rhs = ((au.com.australiapost.model.Options) other);
        return new EqualsBuilder().append(signatureOnDeliveryOption, rhs.signatureOnDeliveryOption).append(authorityToLeaveOption, rhs.authorityToLeaveOption).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
