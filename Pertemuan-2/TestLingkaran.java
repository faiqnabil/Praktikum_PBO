public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();
        
        lingkaran1.r = 7.0;
        
        System.out.println("=== PERHITUNGAN LINGKARAN ===");
        System.out.println("Jari-jari: " + lingkaran1.r + " cm");
        System.out.println("Nilai Phi: " + lingkaran1.phi);
        System.out.println("Luas lingkaran: " + lingkaran1.hitungLuas() + " cm²");
        System.out.println("Keliling lingkaran: " + lingkaran1.hitungKeliling() + " cm");
        
        System.out.println("\n" + "=".repeat(30));
        
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.r = 10.0;
        
        System.out.println("=== LINGKARAN KEDUA ===");
        System.out.println("Jari-jari: " + lingkaran2.r + " cm");
        System.out.println("Luas lingkaran: " + lingkaran2.hitungLuas() + " cm²");
        System.out.println("Keliling lingkaran: " + lingkaran2.hitungKeliling() + " cm");
    }
}
