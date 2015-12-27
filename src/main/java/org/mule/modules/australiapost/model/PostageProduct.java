
package org.mule.modules.australiapost.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import au.com.australiapost.model.*;
import au.com.australiapost.model.Contract;
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
    "group",
    "product_id",
    "contract",
    "options"
})
public class PostageProduct {

    @JsonProperty("type")
    private String type;
    @JsonProperty("group")
    private String group;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("contract")
    private au.com.australiapost.model.Contract contract;
    @JsonProperty("options")
    private Options options;
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

    public au.com.australiapost.model.PostageProduct withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The group
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     *
     * @param group
     *     The group
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public au.com.australiapost.model.PostageProduct withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     *
     * @return
     *     The productId
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     *
     * @param productId
     *     The product_id
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public au.com.australiapost.model.PostageProduct withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *
     * @return
     *     The contract
     */
    @JsonProperty("contract")
    public au.com.australiapost.model.Contract getContract() {
        return contract;
    }

    /**
     *
     * @param contract
     *     The contract
     */
    @JsonProperty("contract")
    public void setContract(au.com.australiapost.model.Contract contract) {
        this.contract = contract;
    }

    public au.com.australiapost.model.PostageProduct withContract(au.com.australiapost.model.Contract contract) {
        this.contract = contract;
        return this;
    }

    /**
     *
     * @return
     *     The options
     */
    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    /**
     *
     * @param options
     *     The options
     */
    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    public au.com.australiapost.model.PostageProduct withOptions(Options options) {
        this.options = options;
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

    public au.com.australiapost.model.PostageProduct withAdditionalProperty(String name, Object value) {
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
            if ("group".equals(name)) {
                if (value instanceof String) {
                    setGroup(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"group\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("product_id".equals(name)) {
                    if (value instanceof String) {
                        setProductId(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"product_id\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("contract".equals(name)) {
                        if (value instanceof au.com.australiapost.model.Contract) {
                            setContract(((Contract) value));
                        } else {
                            throw new IllegalArgumentException(("property \"contract\" is of type \"au.com.australiapost.model.Contract\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("options".equals(name)) {
                            if (value instanceof Options) {
                                setOptions(((Options) value));
                            } else {
                                throw new IllegalArgumentException(("property \"options\" is of type \"au.com.australiapost.model.Options\", but got "+ value.getClass().toString()));
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
            if ("group".equals(name)) {
                return getGroup();
            } else {
                if ("product_id".equals(name)) {
                    return getProductId();
                } else {
                    if ("contract".equals(name)) {
                        return getContract();
                    } else {
                        if ("options".equals(name)) {
                            return getOptions();
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
        Object value = declaredPropertyOrNotFound(name, au.com.australiapost.model.PostageProduct.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.PostageProduct.NOT_FOUND_VALUE!= value) {
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
    public au.com.australiapost.model.PostageProduct with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(group).append(productId).append(contract).append(options).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.PostageProduct) == false) {
            return false;
        }
        au.com.australiapost.model.PostageProduct rhs = ((au.com.australiapost.model.PostageProduct) other);
        return new EqualsBuilder().append(type, rhs.type).append(group, rhs.group).append(productId, rhs.productId).append(contract, rhs.contract).append(options, rhs.options).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
