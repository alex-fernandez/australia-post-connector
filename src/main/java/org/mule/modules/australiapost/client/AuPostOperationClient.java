package org.mule.modules.australiapost.client;

import org.mule.modules.australiapost.config.ConnectorConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AuPostOperationClient extends AbstractClient {

    private static final Logger log = LoggerFactory.getLogger(AuPostOperationClient.class);

    public AuPostOperationClient(ConnectorConfig connectorConfig) {
        super(connectorConfig);
    }


}
