package Percobaan4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Membuat Objek Kucing ===");
        Kucing kucing = new Kucing("Milo", 2, "Persia");
        kucing.berjalan(); 
        kucing.menyusui();
        
        System.out.println("\n=== Membuat Objek Anjing ===");
        Anjing anjing = new Anjing("Buddy", 3, "Golden Retriever", "Kuning Keemasan");
        anjing.menunjukkanInfo();
        System.out.println();
        anjing.berjalan();
        anjing.menggonggong();
        anjing.bermain();
        anjing.menyusui();
    }
}