package Percobaan3;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Persia");
        
        System.out.println("Nama: " + kucing.nama);
        System.out.println("Umur: " + kucing.umur + " tahun");
        System.out.println("Ras: " + kucing.ras);
    }
}