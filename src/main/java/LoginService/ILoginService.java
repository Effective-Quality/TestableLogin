package LoginService;

import LoginDataModel.Login;

/**
 * Created by sebastian on 10/09/16.
 */
public interface ILoginService {

    boolean isLoginValid(Login loginRequest);

}
