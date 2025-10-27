package uts;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;

    public UserProfile() {
    }
    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }
    public int getUser_id() {
        return this.user_id;
    }
    public String get_password() {
        return this.password;
    }
    public String get_name() {
        return this.name;
    }
    public int get_age() {
        return this.age;
    }
    public String get_email() {
        return this.email_id;
    }
    public void edit_profile(String name, int age, String email_id, String doc) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;

        System.out.println("Profile updated successfully!");
    }

    public void show_documents() {
        System.out.println("Documents: " + this.doc);
    }
}