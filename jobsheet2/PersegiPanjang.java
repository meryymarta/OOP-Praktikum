public class PersegiPanjang {
    private int panjang;
    private int lebar;

    //constructor
    public PersegiPanjang (int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getPanjang(){
        return panjang;
    } 

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public void setLebar(int lebar){
        this.lebar = lebar;

    }

    //methode/
    public void displayInfo(){
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);

    }

    public int getLuas(){
        return panjang * lebar;
    }

    public int getKeliling(){
        return 2 * (panjang + lebar);
    }

} 
    

