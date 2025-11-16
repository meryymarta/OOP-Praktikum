package quiz2;

public class Player extends DamageableObject {
    int Score;
    int LivesRemaining;

    Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.Score = 0;
        this.LivesRemaining = livesRemaining;
    }

    @Override
    public void OnKilled() {
        LivesRemaining --;
        System.out.println( Name + " is dead! Remaining lives " + LivesRemaining);
    }
    
}
