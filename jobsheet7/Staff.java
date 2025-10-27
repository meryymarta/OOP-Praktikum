package jobsheet7;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur){
        this.lembur = lembur;
    }

    public int getLembur(){
        return lembur;
    }

    public void setGajiLembur(double gajiLembur){
        this.gajiLembur=gajiLembur;
    }

    public double getGajiLembur(){
        return gajiLembur;
    }

    //overrloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    //overriding
    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo(){
    System.out.printf("%-15s: %s\n", "NIP", this.getNip());
    System.out.printf("%-15s: %s\n", "Nama", this.getNama());
    System.out.printf("%-15s: %s\n", "Golongan", this.getGolongan());
    System.out.printf("%-15s: %.0f\n", "Gaji", this.getGaji());
    System.out.printf("%-15s: %.0f\n", "Jumlah Lembur", this.getGajiLembur());
}


    }
    

