package uts;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Initialization ===");
        
        UserProfile customerProfile = new UserProfile(101, "pass123", "Meriam Oktavia", 20, "mery@email.com", "ID_Card.jpg");
        Customer customer = new Customer(customerProfile);
        
        UserProfile adminProfile = new UserProfile(999, "adminpass", "Administrator", 45, "admin@bengkel.com", "Contract.pdf");
        Admin admin = new Admin(adminProfile);
        
        System.out.println("\n--- Customer ---");
        customer.log_in(101, "pass123");
        customer.apply_verification("SIM.png");
        customer.get_verification_status();

        System.out.println("\n--- Admin ---");
        Vehicle newCar = new Vehicle("V001", "B 1234 ABC", "Toyota Yaris", "Red");
        admin.add_vehicle(newCar);
        
        
        admin.verify_user(customer);
        System.out.println("\n--- Final Verification Check ---");
        customer.get_verification_status();
    }
}
