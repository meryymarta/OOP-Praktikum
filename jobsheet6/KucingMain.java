package jobsheet6;

public class KucingMain {
    public static void main(String[] args) {
        Anggora anggora = new Anggora("Simba", 1, "orange",  "sangat aktif");
        anggora.info();
        System.out.println();

        Persia persia = new Persia("Mimi", 1, "hitam", "pendek");
        persia.info();
        System.out.println();

        //menggunakan contructor tanpa parameter
        Anggora anggora2 = new Anggora("Luna", 3, "Putih", "Aktif");
        anggora2.info();
        System.out.println();

        Persia persia2 = new Persia("Boo",2,"Abu-abu", "Panjang" );
        persia2.info();


    }
    
}
