package Percobaan6;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MOBIL ===");
        Mobil mobil = new Mobil("Toyota", 2022, 4, "Bensin");
        mobil.info();
        mobil.jalankan();
        mobil.nyalakanAC();
        mobil.klakson();
        mobil.berhenti();

        System.out.println("\n=== MOTOR ===");
        Motor motor = new Motor("Honda", 2023, 150, "Sport");
        motor.info();
        motor.jalankan();
        motor.wheelie();
        motor.klakson();
        motor.berhenti();

        System.out.println("\n=== TRUK ===");
        Truk truk = new Truk("Hino", 2021, 10, 6, "Elektronik");
        truk.info();
        truk.muatBarang();
        truk.jalankan();
        truk.klakson();
        truk.berhenti();
        truk.bukaContoh();
    }
}