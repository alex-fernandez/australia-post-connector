package org.mule.modules.australiapost.client;


import org.glassfish.jersey.client.ClientConfig;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.modules.australiapost.config.ConnectorConfig;
import org.mule.modules.australiapost.model.Credential;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public abstract class AbstractClient {

    private ConnectorConfig connectorConfig;
    private WebTarget target;

    protected AbstractClient(ConnectorConfig connectorConfig) {
        ClientConfig clientConfig = new ClientConfig();
        Client client = ClientBuilder.newClient(clientConfig);

        this.connectorConfig = connectorConfig;
        this.target = client.target(connectorConfig.getApiUrl());
    }
    protected void overrideCredentialSettings(Credential credential) {
        if (credential != null) {
            this.connectorConfig.setAccountNumber(credential.getAccountNumber());
            this.connectorConfig.setUsername(credential.getUsername());
            this.connectorConfig.setPassword(credential.getPassword());
        }
    }
    protected void evaluateResponse(Response response) throws ConnectionException {
        switch (response.getStatus()) {
            case 200:
                return;
            case 401:
                throw new ConnectionException(
                        ConnectionExceptionCode.INCORRECT_CREDENTIALS,
                        Integer.toString(response.getStatus()),
                        response.getStatusInfo().getReasonPhrase());
            case 403:
            case 404:
            case 500:
            default:
                throw new ConnectionException(ConnectionExceptionCode.UNKNOWN,
                        Integer.toString(response.getStatus()),
                        response.getStatusInfo().getReasonPhrase());
        }

    }

    public ConnectorConfig getConnectorConfig() {
        return connectorConfig;
    }

    public void setConnectorConfig(ConnectorConfig connectorConfig) {
        this.connectorConfig = connectorConfig;
    }

    public WebTarget getTarget() {
        return target;
    }

    public void setTarget(WebTarget target) {
        this.target = target;
    }

}
