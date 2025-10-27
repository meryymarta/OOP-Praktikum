package jobsheet4;

import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> daftarPesanan; //

    public Pelanggan(String idPelanggan, String nama){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.daftarPesanan = new ArrayList<>();
    }

    public String getIdPelanggan(){
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan){
        this.idPelanggan = idPelanggan;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public ArrayList<Pesanan> getdaftarPesanan(){
        return daftarPesanan;
    }

    public void buatPesanan(String idPesanan){
        Pesanan pesanan = new Pesanan(idPesanan);
        daftarPesanan.add(pesanan);
    }  
    public void tampilkanPesanan(){
        System.out.println("Pelanggan: " + nama + "(ID: " + idPelanggan + ")" );
        if(daftarPesanan.isEmpty()){
            System.out.println(" Belum ada pesanan.");
        } else {
            for(Pesanan pesanan : daftarPesanan){
                pesanan.tampilkanProduk();
                System.out.println();
            }
        }
     }
    
}
