package jobsheet6;

public class Persia extends Kucing{
    private String panjangBulu;

    public Persia(String nama, int umur, String warnaBulu, String panjangBulu){
        super(nama, umur, warnaBulu);
        this.panjangBulu = panjangBulu;
    }

    public Persia(){
        super();
        this.panjangBulu = "Belum diketahui";
    }

        //override
        public void info(){
            super.info();
            System.out.println("Ras: Persia");
            System.out.println("Panjang Bulu: " + this.panjangBulu);
            System.out.println("---------------");

        }
    }
    