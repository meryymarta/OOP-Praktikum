package uts;

public class Vehicle {
    private String vehicle_id;
    private String license_plate;
    private String model;
    private String color;
    
    public Vehicle(String vehicle_id, String license_plate, String model, String color) {
        this.vehicle_id = vehicle_id;
        this.license_plate = license_plate;
        this.model = model;
        this.color = color;
    }

    public String get_vehicle_Id() {
        return vehicle_id;
    }

    public String get_license_plate() {
        return license_plate;
    }

    public String get_model() {
        return model;
    }

    public String get_color() {
        return color;
    }

    public void set_model(String model) {
        this.model = model;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public void display_details() {
        System.out.println("  Vehicle ID   : " + vehicle_id);
        System.out.println("  License Plat : " + license_plate);
        System.out.println("  Model        : " + model);
        System.out.println("  Color        : " + color);
    }
}