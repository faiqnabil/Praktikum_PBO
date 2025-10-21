public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        System.out.println("=== PROGRAM SEGITIGA - METHOD OVERLOADING ===\n");
        
        System.out.println("1. Menghitung sudut ketiga dengan 1 sudut diketahui:");
        int sudutKetiga1 = segitiga.totalSudut(60);
        System.out.println("   Jika sudut A = 60°");
        System.out.println("   Maka sudut yang tersisa = " + sudutKetiga1 + "°");
        System.out.println("   Formula: 180 - 60 = " + sudutKetiga1 + "°\n");
        
        System.out.println("2. Menghitung sudut ketiga dengan 2 sudut diketahui:");
        int sudutKetiga2 = segitiga.totalSudut(60, 80);
        System.out.println("   Jika sudut A = 60° dan sudut B = 80°");
        System.out.println("   Maka sudut C = " + sudutKetiga2 + "°");
        System.out.println("   Formula: 180 - (60 + 80) = " + sudutKetiga2 + "°\n");
        
        System.out.println("3. Menghitung keliling dengan bilangan bulat:");
        int kelilingInt = segitiga.keliling(3, 4, 5);
        System.out.println("   Sisi A = 3, Sisi B = 4, Sisi C = 5");
        System.out.println("   Keliling = " + kelilingInt + " satuan");
        System.out.println("   Formula: 3 + 4 + 5 = " + kelilingInt + "\n");
        
        System.out.println("4. Menghitung keliling dengan bilangan desimal:");
        double kelilingDouble = segitiga.keliling(3.5, 4.2, 5.8);
        System.out.println("   Sisi A = 3.5, Sisi B = 4.2, Sisi C = 5.8");
        System.out.println("   Keliling = " + kelilingDouble + " satuan");
        System.out.println("   Formula: 3.5 + 4.2 + 5.8 = " + kelilingDouble + "\n");
        
        System.out.println("5. Contoh Segitiga Siku-siku (3, 4, 5):");
        System.out.println("   Membuktikan: c² = a² + b²");
        System.out.println("   5² = 3² + 4²");
        System.out.println("   25 = 9 + 16");
        System.out.println("   25 = 25 ✓\n");
        
        System.out.println("6. Segitiga Sama Sisi:");
        System.out.println("   Sudut ketiga: " + segitiga.totalSudut(60, 60) + "°");
        System.out.println("   Keliling: " + segitiga.keliling(10, 10, 10) + " satuan\n");
        
        System.out.println("7. Segitiga Sembarang:");
        System.out.println("   Sudut ketiga: " + segitiga.totalSudut(45, 75) + "°");
        System.out.println("   Keliling: " + segitiga.keliling(7.5, 8.3, 9.2) + " satuan\n");
        
        System.out.println("=== PROGRAM SELESAI ===");
    }
}