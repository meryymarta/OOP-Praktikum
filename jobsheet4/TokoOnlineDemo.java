package jobsheet4;
public class TokoOnlineDemo {
    public static void main(String[] args) {
        //pelanggan 1
        Pelanggan pelanggan1 = new Pelanggan("P001", "Mery");

        pelanggan1.buatPesanan("PSN001");
        pelanggan1.buatPesanan("PSN002");

        pelanggan1.getIdPelanggan(); 
        pelanggan1.getdaftarPesanan().get(0).tambahProduk("PRD001", "Laptop", 7500000);
        pelanggan1.getdaftarPesanan().get(0).tambahProduk("PRD002", "Mouse", 150000);
        pelanggan1.getdaftarPesanan().get(1).tambahProduk("PRD003", "Keyboard", 300000);
        pelanggan1.tampilkanPesanan();

        //pelanggan 2
        Pelanggan pelanggan2 = new Pelanggan("P002", "Dinata");

        
        pelanggan2.buatPesanan("PSN003");
        pelanggan2.getdaftarPesanan().get(0).tambahProduk("PRD004", "Smartphone", 5000000);
        pelanggan2.getdaftarPesanan().get(0).tambahProduk("PRD006", "Charger", 100000);
        pelanggan2.tampilkanPesanan();




    }
}
