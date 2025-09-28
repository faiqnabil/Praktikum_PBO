public class KendaraanDemo {
   public static void main(String[] args) {
        
        Kendaraan kendaraan1 = new Kendaraan("Toyota", 2020, "Putih", 180);
        System.out.println("Merek: " + kendaraan1.merek);
        System.out.println("Tahun: " + kendaraan1.tahunProduksi);
        System.out.println("Warna: " + kendaraan1.warna);
        System.out.println("Kecepatan Tertinggi: " + kendaraan1.kecepatanMaksimal);
        
        Mobil mobil1 = new Mobil("Honda", 2022, "Hitam", 200, 4, "Matic");
        System.out.println("Merek: " + mobil1.merek);
        System.out.println("Tahun: " + mobil1.tahunProduksi);
        System.out.println("Warna: " + mobil1.warna);
        System.out.println("Kecepatan Tertinggi: " + mobil1.kecepatanMaksimal);
        System.out.println("Jumlah Pintu: " + mobil1.ambilJumlahPintu());
        System.out.println("Transmisi: " + mobil1.ambilJenisTransmisi());
        
        Motor motor1 = new Motor("Yamaha", 2021, "Biru", 140, "Sport", 150);
        System.out.println("Merek: " + motor1.merek);
        System.out.println("Tahun: " + motor1.tahunProduksi);
        System.out.println("Warna: " + motor1.warna);
        System.out.println("Kecepatan Tertinggi: " + motor1.kecepatanMaksimal);
        System.out.println("Jenis Motor: " + motor1.ambilJenisMotor());
        System.out.println("Ukuran Mesin: " + motor1.ambilUkuranMesin());
        
        SepedaListrik sepedaListrik1 = new SepedaListrik("Xiaomi", 2023, "Hitam", 25, 10000, "Motor DC");
        System.out.println("Merek: " + sepedaListrik1.merek);
        System.out.println("Tahun: " + sepedaListrik1.tahunProduksi);
        System.out.println("Warna: " + sepedaListrik1.warna);
        System.out.println("Kecepatan Tertinggi: " + sepedaListrik1.kecepatanMaksimal);
        System.out.println("Daya Baterai: " + sepedaListrik1.ambilDayaBaterai());
        System.out.println("Jenis Motor Listrik: " + sepedaListrik1.ambilJenisMotorListrik());
    }
}