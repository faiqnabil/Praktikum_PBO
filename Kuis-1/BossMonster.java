public class BossMonster extends Monster {
    
    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower, type);
    }
    
    @Override
    public void attack(Character target) {
        int baseDamage = (int)(Math.random() * 10) + 5;
        int specialDamage = baseDamage * 2; 
        
        System.out.println(getName() + " uses special attack! Damage: " + specialDamage);
        target.takeDamage(specialDamage);
    }
}