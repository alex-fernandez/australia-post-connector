package au.com.australiapost;

import org.junit.Test;
import org.mule.modules.australiapost.AustraliaPostConnector;

public class AustraliaPostIntegrationTest extends AbstractIntegrationTest {


    @Test
    public void integrationTestMakeBooking() throws Exception {

        AustraliaPostConnector connector = new AustraliaPostConnector();
        connector.setConfig(super.connectorConfig);


    }
}
