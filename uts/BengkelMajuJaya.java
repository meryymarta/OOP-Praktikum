package uts;

public class BengkelMajuJaya {
    public static void main(String[] args) {
        System.out.println("=== Data Servis Bengkel Maju Jaya ===");
        
        Mobil mobil1 = new Mobil ("N 1234 AB", "Toyota", 2020);

        Motor motor1 = new Motor ("N 5678 XY", "Honda", 2022);

        //polimorfisme - overriding
        mobil1.tampilkanDataService();
        motor1.tampilkanDataService();
    }
    
}
