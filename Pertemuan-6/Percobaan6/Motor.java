package Percobaan6;

class Motor extends Kendaraan {
    int kapasitasCC;
    String tipeMotor;

    public Motor(String merk, int tahunProduksi, int kapasitasCC, String tipeMotor) {
        super(merk, tahunProduksi);
        this.kapasitasCC = kapasitasCC;
        this.tipeMotor = tipeMotor;
    }

    @Override
    void jalankan() {
        System.out.println("Motor " + merk + " berjalan dengan gesit...");
    }
    
    @Override
    void berhenti() {
        System.out.println("Motor " + merk + " berhenti dengan cepat");
    }

    void info() {
        super.info();
        System.out.println("Kapasitas CC: " + kapasitasCC);
        System.out.println("Tipe motor: " + tipeMotor);
    }
    
    void wheelie() {
        System.out.println("Motor " + merk + " melakukan wheelie!");
    }
}