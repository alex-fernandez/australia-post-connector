package org.mule.modules.australiapost.model;

import lombok.Data;

@Data
public class Credential {

    private String username;
    private String password;
    private String accountNumber;
}
