
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
    "group",
    "layout",
    "branded",
    "left_offset",
    "top_offset"
})
public class Group {

    @JsonProperty("group")
    private String group;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("branded")
    private Boolean branded;
    @JsonProperty("left_offset")
    private Integer leftOffset;
    @JsonProperty("top_offset")
    private Integer topOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

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

    public au.com.australiapost.model.Group withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 
     * @return
     *     The layout
     */
    @JsonProperty("layout")
    public String getLayout() {
        return layout;
    }

    /**
     * 
     * @param layout
     *     The layout
     */
    @JsonProperty("layout")
    public void setLayout(String layout) {
        this.layout = layout;
    }

    public au.com.australiapost.model.Group withLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * 
     * @return
     *     The branded
     */
    @JsonProperty("branded")
    public Boolean getBranded() {
        return branded;
    }

    /**
     * 
     * @param branded
     *     The branded
     */
    @JsonProperty("branded")
    public void setBranded(Boolean branded) {
        this.branded = branded;
    }

    public au.com.australiapost.model.Group withBranded(Boolean branded) {
        this.branded = branded;
        return this;
    }

    /**
     * 
     * @return
     *     The leftOffset
     */
    @JsonProperty("left_offset")
    public Integer getLeftOffset() {
        return leftOffset;
    }

    /**
     * 
     * @param leftOffset
     *     The left_offset
     */
    @JsonProperty("left_offset")
    public void setLeftOffset(Integer leftOffset) {
        this.leftOffset = leftOffset;
    }

    public au.com.australiapost.model.Group withLeftOffset(Integer leftOffset) {
        this.leftOffset = leftOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The topOffset
     */
    @JsonProperty("top_offset")
    public Integer getTopOffset() {
        return topOffset;
    }

    /**
     * 
     * @param topOffset
     *     The top_offset
     */
    @JsonProperty("top_offset")
    public void setTopOffset(Integer topOffset) {
        this.topOffset = topOffset;
    }

    public au.com.australiapost.model.Group withTopOffset(Integer topOffset) {
        this.topOffset = topOffset;
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

    public au.com.australiapost.model.Group withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("group".equals(name)) {
            if (value instanceof String) {
                setGroup(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"group\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("layout".equals(name)) {
                if (value instanceof String) {
                    setLayout(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"layout\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("branded".equals(name)) {
                    if (value instanceof Boolean) {
                        setBranded(((Boolean) value));
                    } else {
                        throw new IllegalArgumentException(("property \"branded\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("left_offset".equals(name)) {
                        if (value instanceof Integer) {
                            setLeftOffset(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"left_offset\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("top_offset".equals(name)) {
                            if (value instanceof Integer) {
                                setTopOffset(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"top_offset\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
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
        if ("group".equals(name)) {
            return getGroup();
        } else {
            if ("layout".equals(name)) {
                return getLayout();
            } else {
                if ("branded".equals(name)) {
                    return getBranded();
                } else {
                    if ("left_offset".equals(name)) {
                        return getLeftOffset();
                    } else {
                        if ("top_offset".equals(name)) {
                            return getTopOffset();
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
        Object value = declaredPropertyOrNotFound(name, au.com.australiapost.model.Group.NOT_FOUND_VALUE);
        if (au.com.australiapost.model.Group.NOT_FOUND_VALUE!= value) {
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
    public au.com.australiapost.model.Group with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(group).append(layout).append(branded).append(leftOffset).append(topOffset).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof au.com.australiapost.model.Group) == false) {
            return false;
        }
        au.com.australiapost.model.Group rhs = ((au.com.australiapost.model.Group) other);
        return new EqualsBuilder().append(group, rhs.group).append(layout, rhs.layout).append(branded, rhs.branded).append(leftOffset, rhs.leftOffset).append(topOffset, rhs.topOffset).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
