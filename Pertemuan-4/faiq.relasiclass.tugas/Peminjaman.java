public class Peminjaman {
    private Buku buku;
    private Anggota anggota;
    private String tglPinjam;
    private String tglKembali;
    
    public Peminjaman(Buku buku, Anggota anggota, String tglPinjam, String tglKembali) {
        this.buku = buku;
        this.anggota = anggota;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }
    
    public Buku getBuku() {
        return buku;
    }
    
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
    public Anggota getAnggota() {
        return anggota;
    }
    
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }
    
    public String getTglPinjam() {
        return tglPinjam;
    }
    
    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }
    
    public String getTglKembali() {
        return tglKembali;
    }
    
    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }
    
    public String info() {
        return "Peminjaman: " + buku.getJudul() + " oleh " + anggota.getNama() + 
               " dari " + tglPinjam + " sampai " + tglKembali;
    }
}