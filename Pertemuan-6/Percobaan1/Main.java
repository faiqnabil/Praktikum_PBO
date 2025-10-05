package Percobaan1;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        System.out.println("Nama Kucing: " + kucing.nama); 
        kucing.bersuara(); 
        kucing.mengeong();
        
        System.out.println("--------------------");

        Anjing anjing = new Anjing("Buddy");
        System.out.println("Nama Anjing: " + anjing.nama); 
        anjing.bersuara(); 
        anjing.menggonggong(); 
    }
}