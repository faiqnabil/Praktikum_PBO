public class Regen implements StatusEffect {
    private final int perTurn;
    private int duration;

    public Regen(int perTurn, int duration) {
        this.perTurn = perTurn;
        this.duration = duration;
    }

    @Override
    public String name() {
        return "Regen (" + duration + "T)";
    }

    @Override
    public void onTurnStart(Character self) {
        if (duration > 0) {
            int oldHealth = self.getHealth();
            self.setHealth(oldHealth + perTurn); 
            int healedAmount = self.getHealth() - oldHealth;
            System.out.printf("Regen: %s memulihkan %d HP. HP sekarang: %d/%d.\n", 
                self.getName(), healedAmount, self.getHealth(), self.getMaxHealth());
        }
    }

    @Override
    public void onTurnEnd(Character self) {
        duration--;
        if (isExpired()) {
            System.out.println("Efek Regen pada " + self.getName() + " berakhir.");
        }
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }

    @Override
    public double onIncomingDamage(double damage) {
        return damage; 
    }
}