package uts;

public class Motor extends Kendaraan{ //inheritance
    private static final int biaya_Service_motor = 250000;

    public Motor(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun, "Motor");
    }

    // polimorfisme - overriding
    @Override
    public int hitungBiayaService() {
        return biaya_Service_motor;
    }

    @Override
    public void tampilkanDataService() {
        tampilkanDataKendaraan();
        System.out.println("Biaya Servis: " +  "Rp" + hitungBiayaService());
        System.out.println("Biaya Servis + Cuci: " + "Rp" + hitungBiayaService(true));
        System.out.println();
    }
    
}
