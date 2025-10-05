package Percobaan6;

class Truk extends Kendaraan {
    int kapasitasMuatan;
    int jumlahRoda;
    String jenisKargo;

    public Truk(String merk, int tahunProduksi, int kapasitasMuatan, int jumlahRoda, String jenisKargo) {
        super(merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
        this.jumlahRoda = jumlahRoda;
        this.jenisKargo = jenisKargo;
    }

    @Override
    void jalankan() {
        System.out.println("Truk " + merk + " berjalan dengan berat dan stabil...");
    }
    
    @Override
    void berhenti() {
        System.out.println("Truk " + merk + " berhenti secara perlahan");
    }

    void info() {
        super.info();
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " ton");
        System.out.println("Jumlah roda: " + jumlahRoda);
        System.out.println("Jenis kargo: " + jenisKargo);
    }
    
    void muatBarang() {
        System.out.println("Truk sedang memuat barang " + jenisKargo);
    }
    
    void bukaContoh() {
        System.out.println("Kontainer truk dibuka");
    }
}