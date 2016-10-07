package CredentialProvider;

import LoginDataModel.Login;

/**
 * Created by sebastian on 10/09/16.
 */
public class CredentialProvider implements ICredentialProvider {

    public Login returnValidLogin() {

        return new Login("Admin", "123456");

    }

}
