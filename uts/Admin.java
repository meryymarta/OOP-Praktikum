package uts;

public class Admin extends User {

    public Admin(UserProfile profile) {
        super(profile);
    }
    
    public void update_vehicle_details(String vehicle_id, String new_model, String new_color) {
        System.out.println("Updating vehicle details");
        System.out.println("Model change to " + new_model + " and color " + new_color + " for id " + vehicle_id + " successfully.");
    }

    public void add_vehicle(Vehicle newVehicle) {
        System.out.println("Adding a new vehicle to the system");
        newVehicle.display_details();
        System.out.println("Vehicles with plates" + newVehicle.get_license_plate() + " succesfully added.");
    }
    
    public void retrieve_complaint(String complaint_id) {
        System.out.println("Taking complaints with ID: " + complaint_id);
    }

    public void verify_user(Customer customer_to_verify) {
        System.out.println("Successfully verified user");
        customer_to_verify.set_verification_status(true);
    }
}