import LoginController.LoginController;
import LoginDataModel.Login;
import Mocks.mockLoginService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sebastian on 10/09/16.
 */
public class LoginControllerTest {

    LoginController sut;
    mockLoginService mls;

    @Before
    public void setUp(){

        sut = new LoginController();
        mls = new mockLoginService();
        sut.loginService = mls;
    }


    @Test
    public void success_message_if_service_returns_true(){

        mls.setReturnValue(true);

        String r = sut.login("", "");
        String e = "Login successful!";

        Assert.assertEquals("Success message if login was successful", r, e);

    }

    @Test
    public void fail_message_if_service_returns_false(){

        mls.setReturnValue(false);

        String r = sut.login("", "");
        String e = "Login failed!";

        Assert.assertEquals("Success message if login was not successful", r, e);

    }

}
