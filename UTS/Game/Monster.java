import java.util.Random;

public class Monster extends Enemy {
    private AttackStrategy attackStrategy;

    public Monster(String name, int health, int attackPower, int threatLevel, AttackStrategy strategy) {
        super(name, health, attackPower, threatLevel);
        this.attackStrategy = strategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    @Override
    public void attack(Character target) {
        int baseDamage = getAttackPower();
        int strategyBonus = attackStrategy.computeDamage(this, target); 
        
        int totalDamage = baseDamage + strategyBonus;
        
        int finalDamage = totalDamage + new Random().nextInt((totalDamage / 2) + 1); 
        
        double damageAfterHook = target.onIncomingDamage(finalDamage);
        
        target.setHealth(target.getHealth() - (int)damageAfterHook);
        System.out.printf("%s menyerang %s dengan damage %d (efektif: %d).\n", 
            getName(), target.getName(), finalDamage, (int)damageAfterHook);
    }
}