
package org.mule.modules.australiapost.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.australiapost.AustraliaPostConnector;


/**
 * A <code>AustraliaPostConnectorCapabilitiesAdapter</code> is a wrapper around {@link AustraliaPostConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-17T06:30:33+08:00", comments = "Build 3.7.x.2633.51164b9")
public abstract class AustraliaPostConnectorCapabilitiesAdapter
    extends AustraliaPostConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == ModuleCapability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
