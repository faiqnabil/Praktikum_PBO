public class GameTest {
    public static void main(String[] args) {
        System.out.println("=== MONSTER BATTLE GAME ===\n");
        
        Player player = new Player("Faiq Nabil", 150, 30, 8);
        Monster goblin = new Monster("Goblin", 60, 10, "Goblin");
        BossMonster dragon = new BossMonster("Dragon Boss", 120, 25, "Dragon");
        
        System.out.println("Characters:");
        System.out.println("- " + player.getName() + " (HP: " + player.getHealth() + ")");
        System.out.println("- " + goblin.getName() + " (HP: " + goblin.getHealth() + ")");
        System.out.println("- " + dragon.getName() + " (HP: " + dragon.getHealth() + ")");
        
        System.out.println("\n--- Battle 1: Faiq Nabil vs Goblin ---");
        while (player.isAlive() && goblin.isAlive()) {
            player.attack(goblin);
            if (goblin.isAlive()) {
                goblin.attack(player);
            }
        }
        
        if (player.isAlive()) {
            System.out.println("Result: " + player.getName() + " wins!\n");
            
            System.out.println("--- Healing Phase ---");
            player.heal();
            
            System.out.println("\n--- Boss Battle: Faiq Nabil vs Dragon ---");
            while (player.isAlive() && dragon.isAlive()) {
                player.attack(dragon);
                if (dragon.isAlive()) {
                    dragon.attack(player);
                }
                
                if (player.getHealth() < 40 && player.isAlive()) {
                    System.out.println(">> " + player.getName() + " uses strategic healing!");
                    player.heal();
                }
            }
            
            if (player.isAlive()) {
                System.out.println("Result: " + player.getName() + " defeats the boss!");
            } else {
                System.out.println("Result: " + dragon.getName() + " wins!");
            }
        } else {
            System.out.println("Result: " + goblin.getName() + " wins!");
        }
        
        System.out.println("\n--- Polymorphism Demo ---");
        Character[] characters = {player, goblin, dragon};
        Player dummy = new Player("Target", 50, 10, 1);
        
        System.out.println("All characters attack dummy target (showing polymorphism):");
        for (Character c : characters) {
            if (c.isAlive()) {
                c.attack(dummy);
            }
        }
        
        System.out.println("\nGame Over!");
    }
}