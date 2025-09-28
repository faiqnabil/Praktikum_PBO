public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        
        brg1.kode = "B001";
        brg1.namaBarang = "Laptop";
        brg1.harga = 5000000;
        brg1.jumlah = 10;
        
        brg1.tampilData();
        
        int totalHarga = brg1.hitungTotalHarga(3);
        System.out.println("\nTotal harga untuk 3 unit: Rp " + totalHarga);
    
        int totalHarga2 = brg1.hitungTotalHarga(5);
        System.out.println("Total harga untuk 5 unit: Rp " + totalHarga2);
    }
}
