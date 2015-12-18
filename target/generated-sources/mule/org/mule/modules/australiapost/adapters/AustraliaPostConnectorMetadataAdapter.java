
package org.mule.modules.australiapost.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.australiapost.AustraliaPostConnector;


/**
 * A <code>AustraliaPostConnectorMetadataAdapter</code> is a wrapper around {@link AustraliaPostConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-17T06:30:33+08:00", comments = "Build 3.7.x.2633.51164b9")
public abstract class AustraliaPostConnectorMetadataAdapter
    extends AustraliaPostConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "AustraliaPost";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.7.2";
    private final static String DEVKIT_BUILD = "3.7.x.2633.51164b9";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
