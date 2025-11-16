package quiz2;

public class Cactus extends Plant {
    public Cactus(String name){
        super(name);
    }

@Override
public void grow(){
    System.out.println(name + " is growing slowly in the desert.");
}

public void storeWater(){
    System.out.println(name + " stores water in its thick stems.");

}
    
}
