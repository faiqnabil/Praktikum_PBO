package Percobaan6;

class Mobil extends Kendaraan {
    int jumlahPintu;
    String jenisBahanBakar;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    void jalankan() {
        System.out.println("Mobil " + merk + " berjalan dengan mulus...");
    }
    
    @Override
    void berhenti() {
        System.out.println("Mobil " + merk + " berhenti dengan rem ABS");
    }

    void info() {
        super.info();
        System.out.println("Jumlah pintu: " + jumlahPintu);
        System.out.println("Bahan bakar: " + jenisBahanBakar);
    }
    
    void nyalakanAC() {
        System.out.println("AC mobil dinyalakan");
    }
}