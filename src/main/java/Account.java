public class Account {

    private String password_;
    private boolean isLogged_;

    public Account(){
        this.isLogged_ = false;
    }

    public Account(String password){
        this.password_ = password;
        this.isLogged_ = false;
    }

    public void login(String password){

        if (this.isLogged_) return;

        if (password == this.password_){
            this.password_ = password;
            this.isLogged_ = true;
        }

    }

    public void changePassword(String oldPassword, String newPassword){
        if (this.password_ == oldPassword)
            this.password_ = newPassword;
    }

    public String getPassword(){
        return this.password_;
    }

    public boolean isLogged(){
        return this.isLogged_;
    }

}
