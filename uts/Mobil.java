package uts;

public class Mobil extends Kendaraan { //inheritance
    private static final int biaya_Service_mobil = 500000;

    public Mobil(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun, "Mobil");
    }

    // polimorfisme - overriding
    @Override
    public int hitungBiayaService() {
        return biaya_Service_mobil;
    }

    @Override
    public void tampilkanDataService() {
        tampilkanDataKendaraan();
        System.out.println("Biaya Servis: " + "Rp" + hitungBiayaService() );
        System.out.println("Biaya Servis + Cuci: "  + "Rp" + hitungBiayaService(true));
        System.out.println();
    }
    
}
