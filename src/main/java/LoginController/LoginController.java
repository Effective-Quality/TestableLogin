package LoginController;

import LoginDataModel.Login;
import LoginService.ILoginService;
import LoginService.LoginService;

/**
 * Created by sebastian on 10/09/16.
 */
public class LoginController implements ILoginController {

    public ILoginService loginService;

    public LoginController(){
        this.loginService = new LoginService();
    }

    public String login(String username, String password) {

        Login loginRequest = new Login(username, password);

        if(this.loginService.isLoginValid(loginRequest)){
            return "Login successful!";
        } else {
            return "Login failed!";
        }

    }

}
