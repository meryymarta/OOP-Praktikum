package uts;

public class Customer extends User {
    private boolean verification_status = false;

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean get_verification_status() {
        System.out.println("Verification status: " + this.verification_status);
        return this.verification_status;
    }   

    public void set_verification_status(boolean status) {
        this.verification_status = status;
    }

    public void apply_verification(String doc){
        System.out.println("Verification applied with document: " + doc);
    }
    
}
