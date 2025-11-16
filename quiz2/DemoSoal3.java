package quiz2;

public class DemoSoal3 {

    //polymorphic argument
    static void observeGrowth(Plant p){
        p.grow();
    }

    public static void main(String[] args) {
        Plant[] plants = {
            new Flower("Rose"),
            new Tree("Oak Tree"),
            new Cactus("Desert Cactus")
        };

        System.out.println("===PLANT OBSERVATION ===");
        for(Plant p : plants) {
            observeGrowth(p); //Polymorphic Argument

            //instanceof + Object Casting
            if (p instanceof Flower) {
                ((Flower) p).bloom();
            } else if (p instanceof Tree) {
                ((Tree) p).shedLeaves();
            } else if (p instanceof Cactus) {
                ((Cactus)p).storeWater();
            }

            System.out.println();
        }
    }
    
}
