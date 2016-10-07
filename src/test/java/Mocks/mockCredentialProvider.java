package Mocks;

import CredentialProvider.ICredentialProvider;
import LoginDataModel.Login;

/**
 * Created by sebastian on 10/09/16.
 */
public class mockCredentialProvider implements ICredentialProvider{

    Login validMockLogin;

    public Login returnValidLogin() {
        return this.validMockLogin;
    }

    public mockCredentialProvider(String username, String password){
        this.validMockLogin = new Login(username, password);
    }
}
