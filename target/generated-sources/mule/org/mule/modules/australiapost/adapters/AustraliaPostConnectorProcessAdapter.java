
package org.mule.modules.australiapost.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.australiapost.AustraliaPostConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>AustraliaPostConnectorProcessAdapter</code> is a wrapper around {@link AustraliaPostConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-17T06:30:33+08:00", comments = "Build 3.7.x.2633.51164b9")
public abstract class AustraliaPostConnectorProcessAdapter
    extends AustraliaPostConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<AustraliaPostConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, AustraliaPostConnectorCapabilitiesAdapter> getProcessTemplate() {
        final AustraliaPostConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,AustraliaPostConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, AustraliaPostConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, AustraliaPostConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
