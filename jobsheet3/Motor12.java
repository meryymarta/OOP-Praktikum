
public class Motor12 {
    private String platNomor;
    private boolean isMesinon;
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor:" + this.platNomor);
        if(isMesinon){
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("================");
    }

    public String getPlatNomor(){
        return platNomor;
    }
    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }
    public boolean isIsMesinon(){
        return isMesinon;
    }

    public void setIsMesinOn(boolean isMesinon){
        this.isMesinon = isMesinon;
        
    }
    public int getKecepatan(){
        return kecepatan;
    } 
    public void setKecepatan(int kecepatan){
        if(!this.isMesinon && kecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh melebihi 100!");
            this.kecepatan = 100; 

        } else if (kecepatan < 0 ){
            System.out.println("Kecepatan tidak boleh negatif");
        } else {
            this.kecepatan = kecepatan;
        }
}
}
    

