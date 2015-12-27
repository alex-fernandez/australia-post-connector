
package org.mule.modules.australiapost.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import au.com.australiapost.model.*;
import au.com.australiapost.model.Address;
import au.com.australiapost.model.PostageProduct;
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
    "account_number",
    "name",
    "valid_from",
    "valid_to",
    "expired",
    "addresses",
    "details",
    "postage_products",
    "merchant_location_id",
    "credit_blocked"
})
public class Account {

    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("valid_from")
    private String validFrom;
    @JsonProperty("valid_to")
    private String validTo;
    @JsonProperty("expired")
    private Boolean expired;
    @JsonProperty("addresses")
    private List<au.com.australiapost.model.Address> addresses = new ArrayList<au.com.australiapost.model.Address>();
    @JsonProperty("details")
    private Details details;
    @JsonProperty("postage_products")
    private List<PostageProduct> postageProducts = new ArrayList<PostageProduct>();
    @JsonProperty("merchant_location_id")
    private String merchantLocationId;
    @JsonProperty("credit_blocked")
    private Boolean creditBlocked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     *
     * @return
     *     The accountNumber
     */
    @JsonProperty("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber
     *     The account_number
     */
    @JsonProperty("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public au.com.australiapost.model.Account withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public au.com.australiapost.model.Account withName(String name) {
        this.name = name;
        return this;
    }

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

    public au.com.australiapost.model.Account withValidFrom(String validFrom) {
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

    public au.com.australiapost.model.Account withValidTo(String validTo) {
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

    public au.com.australiapost.model.Account withExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     *
     * @return
     *     The addresses
     */
    @JsonProperty("addresses")
    public List<au.com.australiapost.model.Address> getAddresses() {
        return addresses;
    }

    /**
     *
     * @param addresses
     *     The addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<au.com.australiapost.model.Address> addresses) {
        this.addresses = addresses;
    }

    public au.com.australiapost.model.Account withAddresses(List<au.com.australiapost.model.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *
     * @return
     *     The details
     */
    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    /**
     *
     * @param details
     *     The details
     */
    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    public au.com.australiapost.model.Account withDetails(Details details) {
        this.details = details;
        return this;
    }

    /**
     *
     * @return
     *     The postageProducts
     */
    @JsonProperty("postage_products")
    public List<PostageProduct> getPostageProducts() {
        return postageProducts;
    }

    /**
     *
     * @param postageProducts
     *     The postage_products
     */
    @JsonProperty("postage_products")
    public void setPostageProducts(List<PostageProduct> postageProducts) {
        this.postageProducts = postageProducts;
    }

    public au.com.australiapost.model.Account withPostageProducts(List<PostageProduct> postageProducts) {
        this.postageProducts = postageProducts;
        return this;
    }

    /**
     *
     * @return
     *     The merchantLocationId
     */
    @JsonProperty("merchant_location_id")
    public String getMerchantLocationId() {
        return merchantLocationId;
    }

    /**
     *
     * @param merchantLocationId
     *     The merchant_location_id
     */
    @JsonProperty("merchant_location_id")
    public void setMerchantLocationId(String merchantLocationId) {
        this.merchantLocationId = merchantLocationId;
    }

    public au.com.australiapost.model.Account withMerchantLocationId(String merchantLocationId) {
        this.merchantLocationId = merchantLocationId;
        return this;
    }

    /**
     *
     * @return
     *     The creditBlocked
     */
    @JsonProperty("credit_blocked")
    public Boolean getCreditBlocked() {
        return creditBlocked;
    }

    /**
     *
     * @param creditBlocked
     *     The credit_blocked
     */
    @JsonProperty("credit_blocked")
    public void setCreditBlocked(Boolean creditBlocked) {
        this.creditBlocked = creditBlocked;
    }

    public au.com.australiapost.model.Account withCreditBlocked(Boolean creditBlocked) {
        this.creditBlocked = creditBlocked;
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

    public au.com.australiapost.model.Account withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("account_number".equals(name)) {
            if (value instanceof String) {
                setAccountNumber(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"account_number\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("name".equals(name)) {
                if (value instanceof String) {
                    setName(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
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
                            if ("addresses".equals(name)) {
                                if (value instanceof List) {
                                    setAddresses(((List<Address> ) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"addresses\" is of type \"java.util.List<au.com.australiapost.model.Address>\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("details".equals(name)) {
                                    if (value instanceof Details) {
                                        setDetails(((Details) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"details\" is of type \"au.com.australiapost.model.Details\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("postage_products".equals(name)) {
                                        if (value instanceof List) {
                                            setPostageProducts(((List<PostageProduct> ) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"postage_products\" is of type \"java.util.List<au.com.australiapost.model.PostageProduct>\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("merchant_location_id".equals(name)) {
                                            if (value instanceof String) {
                                                setMerchantLocationId(((String) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"merchant_location_id\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("credit_blocked".equals(name)) {
                                                if (value instanceof Boolean) {
                                                    setCreditBlocked(((Boolean) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"credit_blocked\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
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
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("account_number".equals(name)) {
            return getAccountNumber();
        } else {
            if ("name".equals(name)) {
                return getName();
            } else {
                if ("valid_from".equals(name)) {
                    return getValidFrom();
                } else {
                    if ("valid_to".equals(name)) {
                        return getValidTo();
                    } else {
                        if ("expired".equals(name)) {
                            return getExpired();
                        } else {
                            if ("addresses".equals(name)) {
                                return getAddresses();
                            } else {
                                if ("details".equals(name)) {
                                    return getDetails();
                                } else {
                                    if ("postage_products".equals(name)) {
                                        return getPostageProducts();
                                    } else {
                                        if ("merchant_location_id".equals(name)) {
                                            return getMerchantLocationId();
                                        } else {
                                            if ("credit_blocked".equals(name)) {
                                                return getCreditBlocked();
                                            } else {
                                                return notFoundValue;
                                            }
                                        }
                                    }
                                }
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
        Object value = declaredPropertyOrNotFound(name, au.com.australiapost.model.Account.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.Account.NOT_FOUND_VALUE!= value) {
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
    public au.com.australiapost.model.Account with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountNumber).append(name).append(validFrom).append(validTo).append(expired).append(addresses).append(details).append(postageProducts).append(merchantLocationId).append(creditBlocked).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.Account) == false) {
            return false;
        }
        au.com.australiapost.model.Account rhs = ((au.com.australiapost.model.Account) other);
        return new EqualsBuilder().append(accountNumber, rhs.accountNumber).append(name, rhs.name).append(validFrom, rhs.validFrom).append(validTo, rhs.validTo).append(expired, rhs.expired).append(addresses, rhs.addresses).append(details, rhs.details).append(postageProducts, rhs.postageProducts).append(merchantLocationId, rhs.merchantLocationId).append(creditBlocked, rhs.creditBlocked).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
