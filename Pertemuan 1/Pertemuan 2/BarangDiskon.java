public class BarangDiskon {
    String kode;
    String namaBarang;
    double hargaDasar;
    double diskon;
    
    double hitungHargaJual() {
        return hargaDasar - (diskon / 100 * hargaDasar);
    }
    
    void tampilData() {
        System.out.println("=== DATA BARANG ===");
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: Rp " + hitungHargaJual());
    }
}
