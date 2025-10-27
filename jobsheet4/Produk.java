package jobsheet4;
public class Produk {
    private String idProduk;
    private String namaProduk;
    private double harga;
    

    public Produk(String idProduk, String namaProduk, double harga){
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getIdProduk(){
        return idProduk;
    }

    public void setIdProduk(String idProduk){
        this.idProduk = idProduk;
    }

    public String getNamaProduk(){
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public String infoPproduk(){
        return "ID produk: " + idProduk + ", Nama: " + namaProduk + 
        ", Harga: " + harga;
    }

    }

