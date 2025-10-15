
public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String name() {
        return "PiercingStrike";
    }

    @Override
    public void apply(Character self, Character target) {
        int baseDamage = self.getAttackPower();
        int finalDamage = (int) (baseDamage * multiplier);

        double ignoredReduction = 0.25; 
        
        double initialDamage = finalDamage;
        
        double damageAfterHook = target.onIncomingDamage(initialDamage);
        
        double reducedAmount = initialDamage - damageAfterHook;
        
        double piercingAmount = reducedAmount * ignoredReduction; 
        
        double effectiveDamage = damageAfterHook + piercingAmount;

        target.setHealth(target.getHealth() - (int)effectiveDamage);

        System.out.printf("%s menggunakan PiercingStrike pada %s, damage %d (efektif: %d). " + 
            "Mengabaikan 25%% dari damage reduction lawan.\n", 
            self.getName(), target.getName(), finalDamage, (int)effectiveDamage);
    }
}