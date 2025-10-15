import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Character {
    private final String name;
    private int health;
    private int maxHealth; 
    private int attackPower;

    private final List<StatusEffect> effects = new ArrayList<>();

    protected List<Skill> skills;

    public Character(String name, int health, int attackPower) {
        if (health < 0 || attackPower < 0) {
            throw new IllegalArgumentException("Health dan Attack Power tidak boleh negatif.");
        }
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
        this.skills = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getAttackPower() { return attackPower; }
    public List<StatusEffect> getEffects() { return Collections.unmodifiableList(effects); }
    public List<Skill> getSkills() { return Collections.unmodifiableList(skills); }

    public void setHealth(int newHealth) {
        if (newHealth < 0) {
            this.health = 0; 
        } else if (newHealth > maxHealth) {
            this.health = maxHealth; 
        } else {
            this.health = newHealth;
        }
    }

    public void setMaxHealth(int maxHealth) {
        if (maxHealth < 1) {
            throw new IllegalArgumentException("Max Health harus positif.");
        }
        this.maxHealth = maxHealth;
    }
    
    public abstract void attack(Character target);

    public final boolean isAlive() {
        return this.health > 0;
    }

    public final void performTurn(Character target) {
        if (!isAlive()) {
            System.out.println("[!] " + name + " sudah gugur dan tidak dapat bergerak.\n");
            return;
        }

        System.out.println("--- Giliran " + name + " dimulai ---");
        
        // Proses efek di awal giliran
        List<StatusEffect> toRemove = new ArrayList<>();
        for (StatusEffect effect : effects) {
            System.out.println("  > Efek aktif: " + effect.name());
            effect.onTurnStart(this);
            if (effect.isExpired()) {
                toRemove.add(effect);
            }
        }
        effects.removeAll(toRemove);

        // Lakukan serangan jika masih hidup
        if (isAlive() && target.isAlive()) {
            attack(target);
        }

        // Proses efek di akhir giliran
        toRemove.clear();
        for (StatusEffect effect : effects) {
            effect.onTurnEnd(this);
            if (effect.isExpired()) {
                toRemove.add(effect);
            }
        }
        effects.removeAll(toRemove);
        
        // Tampilkan status HP
        System.out.println("  HP " + name + ": " + health + "/" + maxHealth);
        System.out.println("  HP " + target.getName() + ": " + target.getHealth() + "/" + target.getMaxHealth());
        System.out.println("--- Giliran " + name + " selesai ---");
    }

    public void addEffect(StatusEffect e) {
        if (effects.stream().anyMatch(effect -> effect.name().equals(e.name()))) {
            System.out.println("[*] " + name + " sudah memiliki efek " + e.name());
            return;
        }
        effects.add(e);
        System.out.println("[+] " + name + " mendapatkan efek: " + e.name());
    }

    public double onIncomingDamage(double damage) {
        double finalDamage = damage;
        for (StatusEffect effect : effects) {
            finalDamage = effect.onIncomingDamage(finalDamage);
        }
        return finalDamage;
    }
    
    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }
    
    protected void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}