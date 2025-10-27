package jobsheet6;

public class Anggora extends Kucing{
    private String tingkatAktif;

    public Anggora (String nama, int umur, String warnaBulu, String tingkatAktif) {
        super(nama, umur, warnaBulu);
        this.tingkatAktif = tingkatAktif;
    }

    public Anggora(){
        super();
        this.tingkatAktif = "Belum diketahui";
    }

    //override
    public void info(){
        super.info();
        System.out.println("Ras: Anggora");
        System.out.println("Tingkat Aktivitas: " + this.tingkatAktif);
        System.out.println("--------------------------------");
    }
    
}
