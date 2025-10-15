public class Shield implements StatusEffect {
    private final int flatReduce;
    private int duration;

    public Shield(int flatReduce, int duration) {
        this.flatReduce = flatReduce;
        this.duration = duration;
    }

    @Override
    public String name() {
        return "Shield (" + duration + "T, -" + flatReduce + " dmg)";
    }

    @Override
    public void onTurnStart(Character self) {
    }

    @Override
    public void onTurnEnd(Character self) {
        duration--;
        if (isExpired()) {
            System.out.println("Efek Shield pada " + self.getName() + " berakhir.");
        }
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }

    @Override
    public double onIncomingDamage(double damage) {
        double reducedDamage = damage - flatReduce;
        if (reducedDamage < 0) {
            reducedDamage = 0;
        }
        System.out.printf("Shield: Damage %d dikurangi %d (flat reduce) menjadi %d.\n", 
            (int)damage, flatReduce, (int)reducedDamage);
        return reducedDamage;
    }
}