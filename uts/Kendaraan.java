package uts;

public class Kendaraan {
    //enkapsulasi
    private String noPlat;
    private String merk;
    private int tahun;
    private String jenis;

    public Kendaraan(String noPlat, String merk, int tahun, String jenis) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.tahun = tahun;
        this.jenis = jenis;
    }

    public int hitungBiayaService(){
        return 0;
    }

    // polimorfisme - overloading
    public int hitungBiayaService(boolean cuci){
        int biayaAwal = hitungBiayaService();
        if (cuci){
            biayaAwal += 50000;
        }
        return biayaAwal;
}

    public void tampilkanDataKendaraan(){
        System.out.println("No Plat : " + this.noPlat);
        System.out.println("Merk    : " + this.merk);
        System.out.println("Tahun   : " + this.tahun);
        System.out.println("Jenis   : " + this.jenis);
    }

    public void tampilkanDataService(){
        System.out.println();
    }
}
