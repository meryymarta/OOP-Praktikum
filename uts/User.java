package uts;

public class User {
    private UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
        System.out.println("User created with profile: " + profile.getUser_id());
    }

    public boolean log_in(int userId, String password) {
        if (this.profile.getUser_id() == userId && this.profile.get_password().equals(password)) {
            System.out.println("Login succesfully!");
            return true;
        } else {
            System.out.println("Login failed. ID or password is wrong.");
            return false;
        }
    }
    public void recover_password(){
        System.out.println("Password recovery link sent to email");
    }
    
    public void log_out(){
        System.out.println("User logged out successfully");
    }
}
