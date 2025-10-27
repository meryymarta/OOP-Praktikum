package jobsheet7;

public class MainManusia {
    public static void main(String[] args) {
        System.out.println("---Manusia---");
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        System.out.println();

        System.out.println("---Dosen---");
        Dosen dosen = new Dosen();
        dosen.makan();
        dosen.lembur();
        System.out.println();

        System.out.println("---Mahasiswa---");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.makan();
        mahasiswa.tidur();
        System.out.println();
    }
    
    
}
