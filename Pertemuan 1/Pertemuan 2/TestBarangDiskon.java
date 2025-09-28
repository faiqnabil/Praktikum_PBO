public class TestBarangDiskon {
    public static void main(String[] args) {
        BarangDiskon barang1 = new BarangDiskon();
        
        barang1.kode = "BRG001";
        barang1.namaBarang = "Smartphone Samsung";
        barang1.hargaDasar = 5000000;
        barang1.diskon = 15;
        
        barang1.tampilData();
        
        System.out.println("\n" + "=".repeat(25));
        
        BarangDiskon barang2 = new BarangDiskon();
        barang2.kode = "BRG002";
        barang2.namaBarang = "Laptop Gaming";
        barang2.hargaDasar = 12000000;
        barang2.diskon = 20;
        
        barang2.tampilData();
        
        System.out.println("\n" + "=".repeat(25));
        
        try {
            BarangDiskon barang3 = new BarangDiskon();
            barang3.kode = "BRG003";
            barang3.namaBarang = "Tablet";
            barang3.hargaDasar = 3000000;
            barang3.diskon = 25;
            
            System.out.println("Harga jual setelah diskon: Rp " + barang3.hitungHargaJual());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
