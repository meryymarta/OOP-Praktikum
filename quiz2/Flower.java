package quiz2;

public class Flower extends Plant{
    public Flower(String name) {
        super(name);
    }

    @Override
    public void grow(){
        System.out.println(name + " is growing with colorful petals. ");
    }

    public void bloom(){
        System.out.println(name + " is blooming beautifully!");
    }
    
}
