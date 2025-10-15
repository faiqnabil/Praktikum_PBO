public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) {
        this.amount = amount;
    }

    @Override
    public String name() {
        return "HealSkill";
    }

    @Override
    public void apply(Character self, Character target) {
        int oldHealth = self.getHealth();
        self.setHealth(oldHealth + amount); 
        int healedAmount = self.getHealth() - oldHealth;

        System.out.printf("%s menggunakan HealSkill, memulihkan HP sebesar %d. HP sekarang: %d/%d.\n", 
            self.getName(), healedAmount, self.getHealth(), self.getMaxHealth());
    }
}