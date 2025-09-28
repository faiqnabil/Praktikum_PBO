public class Sepeda {
    String merek;
    int kecepatan;
    int gear;
    
    public void setMerek(String newValue) {
        merek = newValue;
    }
    
    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }
    
    public void gantiGear(int newValue) {
        gear = newValue;
    }
    
    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}

class SepedaGunung extends Sepeda {
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
