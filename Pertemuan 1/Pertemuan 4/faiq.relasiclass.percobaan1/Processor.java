public class Processor {
    private String merk;
    private double cache;

    public Processor() {
        this.merk = "";
        this.cache = 0.0;
    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.println("Merk Processor = " + merk);
        System.out.println("Cache Size = " + cache + " MB");
    }
}