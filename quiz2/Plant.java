package quiz2;

public abstract class Plant {
    protected String name;

    public Plant(String name) {
        this.name = name;
    }

    public abstract void grow();
    
}
