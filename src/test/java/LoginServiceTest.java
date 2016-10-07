import LoginDataModel.Login;
import LoginService.LoginService;
import Mocks.mockCredentialProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sebastian on 10/09/16.
 */
public class LoginServiceTest {

    LoginService sut;
    mockCredentialProvider mcp;

    @Before
    public void setUp(){
        sut = new LoginService();
        mcp = new mockCredentialProvider("validUser", "validPassword");
        sut.provider = mcp;
    }

    @Test
    public void invalid_credentials_must_return_false(){
        // Arrange
        Login invalidCredentials = new Login("invalidUser", "invalidPassword");

        // Act
        boolean loginResult = sut.isLoginValid(invalidCredentials);

        // Assert
        Assert.assertFalse("Invalid credentials must return false", loginResult);
    }

    @Test
    public void invalid_username_must_return_false(){
        // Arrange
        Login invalidUsername = new Login("invalidUser", "validPassword");

        // Act
        boolean loginResult = sut.isLoginValid(invalidUsername);

        // Assert
        Assert.assertFalse("Invalid username must return false", loginResult);
    }

    @Test
    public void invalid_password_must_return_false(){
        // Arrange
        Login invalidPassword = new Login("validUser", "invalidPassword");

        // Act
        boolean loginResult = sut.isLoginValid(invalidPassword);

        // Assert
        Assert.assertFalse("Invalid password must return false", loginResult);
    }

    @Test
    public void valid_credentials_must_return_true(){
        // Arrange
        Login validCredentials = new Login("validUser", "validPassword");

        // Act
        boolean loginResult = sut.isLoginValid(validCredentials);

        // Assert
        Assert.assertTrue("Valid credentials must return false", loginResult);
    }

    @Test
    public void empty_credentials_must_return_true(){
        // Arrange
        Login validCredentials = new Login("", "");

        // Act
        boolean loginResult = sut.isLoginValid(validCredentials);

        // Assert
        Assert.assertFalse("Empty credentials must return false", loginResult);
    }

}
