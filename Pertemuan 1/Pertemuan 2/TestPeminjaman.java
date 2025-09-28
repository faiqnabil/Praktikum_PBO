public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pinjam1 = new Peminjaman();
        
        pinjam1.id = 1001;
        pinjam1.namaMember = "Budi Santoso";
        pinjam1.namaGame = "FIFA 2024";
        pinjam1.harga = 15000;
        pinjam1.lamaSewa = 3;
        
        pinjam1.tampilDataPeminjaman();
        
        System.out.println("\n" + "=".repeat(25));
        
        Peminjaman pinjam2 = new Peminjaman();
        pinjam2.id = 1002;
        pinjam2.namaMember = "Sari Dewi";
        pinjam2.namaGame = "Call of Duty";
        pinjam2.harga = 20000;
        pinjam2.lamaSewa = 2;
        
        pinjam2.tampilDataPeminjaman();
    }
}
