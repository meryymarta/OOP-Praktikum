package quiz2;

public class Tree extends Plant {
    public Tree(String name){
        super(name);
    }

@Override
public void grow(){
    System.out.println(name + " is growing taller and spreading its branches.");
}

public void shedLeaves(){
    System.out.println(name + " is shedding its leaves for the season.");
}
    
}
