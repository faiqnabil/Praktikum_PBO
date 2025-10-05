package Percobaan5;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "orange");
        kucing.info();
        
        System.out.println();
        
        System.out.println("Akses Umur (protected): " + kucing.umur); 
        System.out.println();
        kucing.berjalan();
    }
}