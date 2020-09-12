
package example3;


public class LoginForm {
    private String username; 
    private int password; 

    public LoginForm() {
    }

    public LoginForm(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginForm{" + "username=" + username + ", password=" + password + '}';
    }
    
    
}
