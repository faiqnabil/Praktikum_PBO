public class Barang {
    String kode;
    String namaBarang;
    int harga;
    int jumlah;
    
    int hitungTotalHarga(int jumlahBeli) {
        int total = harga * jumlahBeli;
        return total;
    }
    
    void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
    }
}
