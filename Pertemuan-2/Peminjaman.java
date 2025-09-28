public class Peminjaman {
    int id;
    String namaMember;
    String namaGame;
    double harga;
    int lamaSewa;
    
    void tampilDataPeminjaman() {
        System.out.println("=== DATA PEMINJAMAN ===");
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga per hari: Rp " + harga);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Total Harga: Rp " + hitungHargaBayar());
    }
    
    double hitungHargaBayar() {
        return lamaSewa * harga;
    }
}
