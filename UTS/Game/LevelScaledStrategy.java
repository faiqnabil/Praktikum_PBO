public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int level;
        if (self instanceof Enemy) {
            level = ((Enemy) self).getThreatLevel();
        } else if (self instanceof Player) {
            level = self.getMaxHealth() / 100; 
            if (level < 1) level = 1; 
        } else {
            level = 1;
        }
        
        int calculatedBonus = level * bonusPerLevel;
        System.out.println(self.getName() + " menggunakan LevelScaledStrategy. Bonus damage: " + calculatedBonus);
        return calculatedBonus;
    }
}