package au.com.australiapost;

import org.junit.Before;
import org.mule.modules.australiapost.config.ConnectorConfig;

public abstract class AbstractIntegrationTest {
    protected ConnectorConfig connectorConfig;

    @Before
    public void initializeConfig() {
        connectorConfig = new ConnectorConfig();

    }

}
