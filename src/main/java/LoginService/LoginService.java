package LoginService;

import CredentialProvider.CredentialProvider;
import CredentialProvider.ICredentialProvider;
import LoginDataModel.Login;

/**
 * Created by sebastian on 10/09/16.
 */
public class LoginService implements ILoginService {

    public ICredentialProvider provider;
    private Login loginRequest;

    public LoginService(){
        this.provider = new CredentialProvider();
    }

    public boolean isLoginValid(Login loginRequest) {

        this.loginRequest = loginRequest;
        Login validLogin = provider.returnValidLogin();

        if(loginRequest.equals(validLogin)){
            return true;
        } else {
            return false;
        }

    }

}
