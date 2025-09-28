public class MainTugas {
    public static void main(String[] args) {
  
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("001", "Pemrograman Java", "John Doe");
        Buku buku2 = new Buku("002", "Struktur Data", "Jane Smith");
        Buku buku3 = new Buku("003", "Algoritma dan Pemrograman", "Bob Johnson");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        Anggota anggota1 = new Anggota("A001", "Alice", "Jl. Merdeka No. 1");
        Anggota anggota2 = new Anggota("A002", "Bob", "Jl. Sudirman No. 2");
        
        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);
        
        perpustakaan.pinjamBuku(buku1, anggota1, "2023-10-01", "2023-10-15");
        perpustakaan.pinjamBuku(buku2, anggota2, "2023-10-02", "2023-10-16");
        perpustakaan.pinjamBuku(buku3, anggota1, "2023-10-03", "2023-10-17");
        
        perpustakaan.tampilkanDaftarBuku();
        System.out.println();
        perpustakaan.tampilkanDaftarAnggota();
        System.out.println();
        perpustakaan.tampilkanInfoPeminjaman();
    }
}