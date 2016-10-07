package Mocks;

import LoginDataModel.Login;
import LoginService.ILoginService;

/**
 * Created by sebastian on 10/09/16.
 */
public class mockLoginService implements ILoginService {

    private boolean returnValue;

    public boolean isLoginValid(Login loginRequest) {
        return this.returnValue;
    }

    public void setReturnValue(boolean value){
        this.returnValue = value;
    }

}
