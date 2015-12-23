package org.mule.modules.australiapost.client;

import org.mule.api.ConnectionException;
import org.mule.modules.australiapost.config.ConnectorConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class AbstractOperationClient extends AbstractClient {

    private static final Logger log = LoggerFactory.getLogger(AbstractOperationClient.class);
    private static final String ACCOUNT_HEADER = "Account-Number";
    private static final String AUTH_HEADER = "Authorization";
    private AuthenticationClient authClient;

    protected AbstractOperationClient(ConnectorConfig connectorConfig) throws ConnectionException {
        super(connectorConfig);
        initAuthClient();
    }

    protected void initAuthClient() throws ConnectionException {
        authClient = new AuthenticationClient(getConnectorConfig());
    }

    public void setAuthClient(AuthenticationClient authClient) {
        this.authClient = authClient;
    }

    protected WebTarget urlBuilder(String path) {
        return getTarget().path(path);
    }

    public Response get(String path) {
        return this.urlBuilder(path)
                .request()
                .header(AUTH_HEADER, authClient.getBasicAuthToken())
                .header(ACCOUNT_HEADER, authClient.getBasicAuthToken())
                .accept(MediaType.APPLICATION_JSON).get();

    }

    public Response post(String path, Entity<?> entity) {
        return this.urlBuilder(path)
                .request()
                .header(AUTH_HEADER, authClient.getBasicAuthToken())
                .header(ACCOUNT_HEADER, authClient.getBasicAuthToken())
                .accept(MediaType.APPLICATION_JSON).post(entity, Response.class);
    }

    public Response put(String path, Entity<?> entity) {
        return this.urlBuilder(path)
                .request()
                .header(AUTH_HEADER, authClient.getBasicAuthToken())
                .header(ACCOUNT_HEADER, authClient.getBasicAuthToken())
                .accept(MediaType.APPLICATION_JSON).put(entity, Response.class);

    }
}
