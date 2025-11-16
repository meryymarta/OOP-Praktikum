package quiz2;

public class Monster extends DamageableObject {
    int ThreatLevel;
    String Color;

    Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.ThreatLevel = threatLevel;
        this.Color = color;
    }

    String MakeNoise(){
        return "GRRRARHHHA!";
    }

    @Override
    public void OnKilled(){
        System.out.println("Monster " + Name + " (" + Color + ") was slain!");

    }
    
}
