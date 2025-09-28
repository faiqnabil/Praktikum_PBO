public class Kendaraan {
    String merek;
    int tahunProduksi;
    String warna;
    int kecepatanMaksimal;
    
    public Kendaraan(String merek, int tahunProduksi, String warna, int kecepatanMaksimal) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }
    
    public void hidupkan() {
        System.out.println(merek + " dihidupkan");
    }
    
    public void matikan() {
        System.out.println(merek + " dimatikan");
    }
    
    public void jalan() {
        System.out.println(merek + " mulai berjalan");
    }
    
    public void tampilkanInfo() {
        System.out.println("=== INFO KENDARAAN ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Tertinggi: " + kecepatanMaksimal + " km/jam");
    }
}

class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisTransmisi;
    
    public Mobil(String merek, int tahunProduksi, String warna, int kecepatanMaksimal, 
                 int jumlahPintu, String jenisTransmisi) {
        super(merek, tahunProduksi, warna, kecepatanMaksimal);
        this.jumlahPintu = jumlahPintu;
        this.jenisTransmisi = jenisTransmisi;
    }
    public int ambilJumlahPintu() {
        return jumlahPintu;
    }
    public String ambilJenisTransmisi() {
        return jenisTransmisi;
    }
    public void hidupkan() {
        System.out.println("Mobil " + merek + " dihidupkan dengan kunci");
    }
    public void bukaPintu() {
        System.out.println("Pintu mobil " + merek + " dibuka");
    }
    public void tutupPintu() {
        System.out.println("Pintu mobil " + merek + " ditutup");
    }
    public void bunyikanKlakson() {
        System.out.println("Mobil " + merek + " berbunyi: TIN TIN!");
    }
    public void tampilkanInfo() {
        System.out.println("=== INFO MOBIL ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Tertinggi: " + kecepatanMaksimal + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Transmisi: " + jenisTransmisi);
    }
}

class Motor extends Kendaraan {
    private String jenisMotor;
    private int ukuranMesin;
    
    public Motor(String merek, int tahunProduksi, String warna, int kecepatanMaksimal,
                 String jenisMotor, int ukuranMesin) {
        super(merek, tahunProduksi, warna, kecepatanMaksimal);
        this.jenisMotor = jenisMotor;
        this.ukuranMesin = ukuranMesin;
    }
    public String ambilJenisMotor() {
        return jenisMotor;
    }
    public int ambilUkuranMesin() {
        return ukuranMesin;
    }
    public void hidupkan() {
        System.out.println("Motor " + merek + " dihidupkan dengan starter");
    }
    public void pakaKickStarter() {
        System.out.println("Motor " + merek + " dihidupkan dengan kick starter");
    }
    public void gas() {
        System.out.println("Motor " + merek + " ngegas: BRUM BRUM!");
    }
    public void rem() {
        System.out.println("Motor " + merek + " direm");
    }
    public void tampilkanInfo() {
        System.out.println("=== INFO MOTOR ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Tertinggi: " + kecepatanMaksimal + " km/jam");
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Ukuran Mesin: " + ukuranMesin + " cc");
    }
}

class SepedaListrik extends Kendaraan {
    private int dayaBaterai;
    private String jenisMotorListrik;
    
    public SepedaListrik(String merek, int tahunProduksi, String warna, int kecepatanMaksimal,
                         int dayaBaterai, String jenisMotorListrik) {
        super(merek, tahunProduksi, warna, kecepatanMaksimal);
        this.dayaBaterai = dayaBaterai;
        this.jenisMotorListrik = jenisMotorListrik;
    }
    public int ambilDayaBaterai() {
        return dayaBaterai;
    }
    public String ambilJenisMotorListrik() {
        return jenisMotorListrik;
    }
    public void hidupkan() {
        System.out.println("Sepeda listrik " + merek + " dihidupkan dengan tombol power");
    }
    public void casiBaterai() {
        System.out.println("Sepeda listrik " + merek + " sedang dicas");
    }
    public void modeKayuh() {
        System.out.println("Sepeda listrik " + merek + " pindah ke mode kayuh biasa");
    }
    public void modeCepat() {
        System.out.println("Sepeda listrik " + merek + " pindah ke mode super cepat!");
    }
    public void tampilkanInfo() {
        System.out.println("=== INFO SEPEDA LISTRIK ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Tertinggi: " + kecepatanMaksimal + " km/jam");
        System.out.println("Daya Baterai: " + dayaBaterai + " mAh");
        System.out.println("Jenis Motor Listrik: " + jenisMotorListrik);
    }
}