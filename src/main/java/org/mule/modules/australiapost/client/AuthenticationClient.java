package org.mule.modules.australiapost.client;

import au.com.australiapost.model.Account;
import org.apache.commons.codec.binary.Base64;
import org.mule.api.ConnectionException;
import org.mule.modules.australiapost.config.ConnectorConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;


public class AuthenticationClient extends AbstractOperationClient {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationClient.class);

    protected AuthenticationClient(ConnectorConfig connectorConfig) throws ConnectionException {
        super(connectorConfig);
    }


    protected String getBasicAuthToken() {
        String userCredentials = this.getConnectorConfig().getUsername() + ":" + this.getConnectorConfig().getPassword();
        return String.format("Basic %s:%s", Base64.encodeBase64(userCredentials.getBytes()));
    }

    protected Account authenticate() throws Exception {
        Response response = get("account/" + this.getConnectorConfig().getAccountNumber());
        evaluateResponse(response);
        return response.readEntity(Account.class);
    }
}
