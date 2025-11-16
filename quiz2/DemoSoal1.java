package quiz2;

public class DemoSoal1 {
    public static void main(String[] args) {
        Player player = new Player("Levi", 5, 10, 100, 1);
        Monster monster = new Monster("Goblin", 8, 12, 70, 2, "Green");

        System.out.println("=== [ GAME START ] ===");
        System.out.println(player.Name + " encounters a " + monster.Name + "!");
        System.out.println(monster.Name + " makes a noise: " + monster.MakeNoise());
        System.out.println();

        System.out.println("=== Player Attacks Monster ===");
        System.out.println(player.Name + " attacks " + monster.Name + "!!!");
        monster.TakeDamage(30);
        monster.TakeDamage(25);
        System.out.println();

        System.out.println("=== Monster Counterattacks ===");
        player.TakeDamage(50);
        player.TakeDamage(60);
        System.out.println();

        System.out.println("=== Game Over ===");
    }
    
}
