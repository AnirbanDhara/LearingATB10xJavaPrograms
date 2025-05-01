package ex_17_OOPs.encapsulation;

public class VwoLogin {
    private String username;
    private String password;



    public VwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin)
        {
            this.password = password;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
