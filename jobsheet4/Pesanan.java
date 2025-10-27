 package jobsheet4;

 import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private ArrayList<Produk> daftarProduk; //

    public Pesanan(String idPesanan){
        this.idPesanan = idPesanan;
        this.daftarProduk = new ArrayList<>();
    }

    public String getIdPesanan(){
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan){
        this.idPesanan = idPesanan;
    }

    public ArrayList<Produk> getDaftarProduk(){
        return daftarProduk;
    }

    public void tambahProduk(String idProduk, String namaProduk, int harga) {
        Produk produk = new Produk(idProduk, namaProduk, harga);
        daftarProduk.add(produk);
    }

    public void tampilkanProduk(){
        System.out.println("Pesanan ID:" + idPesanan);
        for(Produk produk : daftarProduk){
            System.out.println(" " +produk.infoPproduk());
        }
    }

    }
