package quiz2;

public abstract class DamageableObject extends GameObject {
    public int MaxHealth;
    private int Health;

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.MaxHealth = maxHealth;
        this.Health = maxHealth;
    }

    boolean IsDead() {
        return Health <= 0;
    }

    void TakeDamage(int damage) {
        Health -= damage;
        System.out.println(Name + " takes " + damage + " damage. Remaining HP: " + Health);

        if (IsDead()) {
            OnKilled();
            Despawn();
        }
    }
    
    public abstract void OnKilled();
}