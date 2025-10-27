package jobsheet6;

public class Kucing {
    private String nama;
    private int umur;
    private String warnaBulu;

    public Kucing(String nama, int umur, String warnaBulu) {
        this.nama = nama;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    public Kucing(){
    }
    
    public void info(){
        System.out.println("---Informasi Kucing---");
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}
