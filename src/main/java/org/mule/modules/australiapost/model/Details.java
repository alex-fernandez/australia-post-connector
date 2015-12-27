
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
    "acn",
    "contact_number",
    "email_address",
    "lodgement_postcode"
})
public class Details {

    @JsonProperty("acn")
    private String acn;
    @JsonProperty("contact_number")
    private String contactNumber;
    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("lodgement_postcode")
    private String lodgementPostcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The acn
     */
    @JsonProperty("acn")
    public String getAcn() {
        return acn;
    }

    /**
     * 
     * @param acn
     *     The acn
     */
    @JsonProperty("acn")
    public void setAcn(String acn) {
        this.acn = acn;
    }

    public au.com.australiapost.model.Details withAcn(String acn) {
        this.acn = acn;
        return this;
    }

    /**
     * 
     * @return
     *     The contactNumber
     */
    @JsonProperty("contact_number")
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 
     * @param contactNumber
     *     The contact_number
     */
    @JsonProperty("contact_number")
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public au.com.australiapost.model.Details withContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The email_address
     */
    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public au.com.australiapost.model.Details withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The lodgementPostcode
     */
    @JsonProperty("lodgement_postcode")
    public String getLodgementPostcode() {
        return lodgementPostcode;
    }

    /**
     * 
     * @param lodgementPostcode
     *     The lodgement_postcode
     */
    @JsonProperty("lodgement_postcode")
    public void setLodgementPostcode(String lodgementPostcode) {
        this.lodgementPostcode = lodgementPostcode;
    }

    public au.com.australiapost.model.Details withLodgementPostcode(String lodgementPostcode) {
        this.lodgementPostcode = lodgementPostcode;
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

    public au.com.australiapost.model.Details withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("acn".equals(name)) {
            if (value instanceof String) {
                setAcn(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"acn\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("contact_number".equals(name)) {
                if (value instanceof String) {
                    setContactNumber(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"contact_number\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("email_address".equals(name)) {
                    if (value instanceof String) {
                        setEmailAddress(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"email_address\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("lodgement_postcode".equals(name)) {
                        if (value instanceof String) {
                            setLodgementPostcode(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"lodgement_postcode\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("acn".equals(name)) {
            return getAcn();
        } else {
            if ("contact_number".equals(name)) {
                return getContactNumber();
            } else {
                if ("email_address".equals(name)) {
                    return getEmailAddress();
                } else {
                    if ("lodgement_postcode".equals(name)) {
                        return getLodgementPostcode();
                    } else {
                        return notFoundValue;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, au.com.australiapost.model.Details.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.Details.NOT_FOUND_VALUE!= value) {
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
    public au.com.australiapost.model.Details with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acn).append(contactNumber).append(emailAddress).append(lodgementPostcode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.Details) == false) {
            return false;
        }
        au.com.australiapost.model.Details rhs = ((au.com.australiapost.model.Details) other);
        return new EqualsBuilder().append(acn, rhs.acn).append(contactNumber, rhs.contactNumber).append(emailAddress, rhs.emailAddress).append(lodgementPostcode, rhs.lodgementPostcode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
