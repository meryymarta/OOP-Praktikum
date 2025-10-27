package jobsheet7;

public class Segitiga {
private int sudut;

   public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB){
        return (sisiA) + (sisiB) + (sisiA * sisiA / sisiA) + (sisiB * sisiB / sisiB);
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total Sudut ( 1 parameter)" + segitiga.totalSudut(60));
        System.out.println("Total Sudut ( 2 parameter)" + segitiga.totalSudut(60, 40));
        System.out.println("Keliling: " + segitiga.keliling(60, 60, 60));
        System.out.println("Keliling: " + segitiga.keliling(60, 60));
    }

}




