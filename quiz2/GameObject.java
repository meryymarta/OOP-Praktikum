package quiz2;

class GameObject {
    public String Name;
    public int PosX;
    public int PosY;

    GameObject(String name, int posX, int posY) {
        this.Name = name;
        this.PosX = posX;
        this.PosY = posY;
    }

   public void Despawn() {
        System.out.println(Name + " has been despawned");
    }
}
