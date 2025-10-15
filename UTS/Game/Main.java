import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AttackStrategy fixedStrategy = new FixedStrategy();
        AttackStrategy levelScaledStrategy = new LevelScaledStrategy(5); 
        
        Player p1 = new Player("Ksatria", 300, 30, fixedStrategy);
        Player p2 = new Player("Penyihir", 150, 45, levelScaledStrategy);

        p1.addEffect(new Shield(15, 3)); 
        p2.addEffect(new Regen(10, 5)); 

        Monster m1 = new Monster("Goblin", 100, 20, 1, fixedStrategy);
        Monster m2 = new Monster("Orc", 180, 25, 3, levelScaledStrategy);
        BossMonster boss = new BossMonster("Naga", 500, 50, 5, levelScaledStrategy);

        List<Character> teamA = Arrays.asList(p1, p2);
        List<Character> teamB = Arrays.asList(m1, m2, boss);

        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}