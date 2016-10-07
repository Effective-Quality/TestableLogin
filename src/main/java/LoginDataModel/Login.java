package LoginDataModel;

/**
 * Created by sebastian on 10/09/16.
 */
public class Login {

    private String username;
    private String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean equals(Login login) {

        if(this.username == login.username && this.password == login.password) {
            return true;
        } else {
            return false;
        }

    }
}
