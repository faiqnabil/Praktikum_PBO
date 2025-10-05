package Percobaan6;

abstract class Kendaraan {
    String merk;
    int tahunProduksi;

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    abstract void jalankan();
    
    abstract void berhenti();

    void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun produksi: " + tahunProduksi);
    }
    
    void klakson() {
        System.out.println(merk + " membunyikan klakson: Tin tin!");
    }
}