public abstract class Enemy extends Character {
    private final int threatLevel;

    public Enemy(String name, int health, int attackPower, int threatLevel) {
        super(name, health, attackPower);
        if (threatLevel < 1 || threatLevel > 5) {
            throw new IllegalArgumentException("Threat Level harus antara 1 sampai 5.");
        }
        this.threatLevel = threatLevel;
    }

    public int getThreatLevel() {
        return threatLevel;
    }
}