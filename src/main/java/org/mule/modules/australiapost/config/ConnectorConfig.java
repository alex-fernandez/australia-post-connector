package org.mule.modules.australiapost.config;

import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.modules.australiapost.client.AuPostOperationClient;
import org.mule.modules.australiapost.client.AuthenticationClient;

@ConnectionManagement(friendlyName = "Australia Post Configuration")
public class ConnectorConfig {

    private AuthenticationClient authenticationClient;
    private AuPostOperationClient auPostOperationClient;

    @Configurable
    @Default("https://digitalapi.auspost.com.au:448/testbed/shipping/v1")
    private String apiUrl;


    @Configurable
    @Default("000000")
    private String accountNumber;

    private String username;

    private String password;



    /**
     * Connect
     *
     * @param username A username
     * @param password A password
     * @throws ConnectionException
     */
    @Connect
    @TestConnectivity
    public void connect(@ConnectionKey String username, @Password String password)
            throws ConnectionException {
        this.username = username;
        this.password = password;
        authenticationClient = new AuthenticationClient(this);
        auPostOperationClient = new AuPostOperationClient(this);
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        /*
         * CODE FOR CLOSING A CONNECTION GOES IN HERE
         */
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        //TODO: Change it to reflect that we are connected.
        return false;
    }

    /**
     * Are we connected
     */
    @ConnectionIdentifier
    public String connectionId() {
        return "001";
    }



    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}