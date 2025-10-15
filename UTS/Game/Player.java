import java.util.Random;

public class Player extends Character {
    private AttackStrategy attackStrategy;

    public Player(String name, int health, int attackPower, AttackStrategy strategy) {
        super(name, health, attackPower);
        this.attackStrategy = strategy;
        addSkill(new HealSkill(20)); 
        addSkill(new PiercingStrike(1.5)); 
    }
    
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    @Override
    public void attack(Character target) {
        if (!getSkills().isEmpty() && new Random().nextBoolean()) {
            Skill selectedSkill = getSkills().get(new Random().nextInt(getSkills().size()));
            selectedSkill.apply(this, target);
        } else {
            int baseDamage = getAttackPower();
            int damage = attackStrategy.computeDamage(this, target); 
            int finalDamage = baseDamage + damage;
            
            double damageAfterHook = target.onIncomingDamage(finalDamage);
            target.setHealth(target.getHealth() - (int)damageAfterHook);
            
            System.out.printf("  >> %s menyerang %s dengan serangan dasar\n", getName(), target.getName());
            System.out.printf("     Damage: %d | Efektif: %d\n", finalDamage, (int)damageAfterHook);
        }
    }
}