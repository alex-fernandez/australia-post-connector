
package org.mule.modules.australiapost.connectivity;

import javax.annotation.Generated;
import org.mule.api.ConnectionException;
import org.mule.devkit.internal.connection.management.ConnectionManagementConnectionAdapter;
import org.mule.devkit.internal.connection.management.TestableConnection;
import org.mule.modules.australiapost.config.ConnectorConfig;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-17T06:30:33+08:00", comments = "Build 3.7.x.2633.51164b9")
public class ConnectorConfigAustraliaPostConnectorAdapter
    extends ConnectorConfig
    implements ConnectionManagementConnectionAdapter<ConnectorConfig, ConnectionManagementConfigAustraliaPostConnectorConnectionKey> , TestableConnection<ConnectionManagementConfigAustraliaPostConnectorConnectionKey>
{


    @Override
    public void connect(ConnectionManagementConfigAustraliaPostConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword());
    }

    @Override
    public void test(ConnectionManagementConfigAustraliaPostConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword());
    }

    @Override
    public void disconnect() {
        super.disconnect();
    }

    @Override
    public String connectionId() {
        return super.connectionId();
    }

    @Override
    public boolean isConnected() {
        return super.isConnected();
    }

    @Override
    public ConnectorConfig getStrategy() {
        return this;
    }

}
