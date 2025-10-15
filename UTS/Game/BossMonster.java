public class BossMonster extends Enemy {
    private int turnCount = 0;
    private AttackStrategy attackStrategy;

    public BossMonster(String name, int health, int attackPower, int threatLevel, AttackStrategy strategy) {
        super(name, health, attackPower, threatLevel);
        this.attackStrategy = strategy;
    }
    
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    private void rageStrike(Character target) {
        int baseDamage = getAttackPower();
        int strategyBonus = attackStrategy.computeDamage(this, target);
        
        int totalDamage = baseDamage + strategyBonus;
        int finalDamage = totalDamage * 2; 
        
        double damageAfterHook = target.onIncomingDamage(finalDamage);
        target.setHealth(target.getHealth() - (int)damageAfterHook);
        
        System.out.printf("!!! %s MENGAMUK (Rage Strike) menyerang %s dengan damage %d (efektif: %d)!!!\n", 
            getName(), target.getName(), finalDamage, (int)damageAfterHook);
    }

    @Override
    public void attack(Character target) {
        turnCount++;
        boolean isRageStrike = (getHealth() < getMaxHealth() * 0.5) || (turnCount % 3 == 0);
        
        if (isRageStrike) {
            rageStrike(target);
        } else {
            int baseDamage = getAttackPower();
            int strategyBonus = attackStrategy.computeDamage(this, target);
            int finalDamage = baseDamage + strategyBonus;

            double damageAfterHook = target.onIncomingDamage(finalDamage);
            target.setHealth(target.getHealth() - (int)damageAfterHook);
            
            System.out.printf("%s menyerang %s dengan damage %d (efektif: %d).\n", 
                getName(), target.getName(), finalDamage, (int)damageAfterHook);
        }
        
        if (turnCount >= 3) {
            turnCount = 0;
        }
    }
}