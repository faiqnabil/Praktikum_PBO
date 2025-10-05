package Percobaan2;

public class Main {
    public static void main(String[] args) {

        Anjing anjing = new Anjing("Buddy");
        
        System.out.println("Nama Anjing: " + anjing.nama); 
        
        anjing.bersuara(); 
        
        anjing.menggonggong(); 
    }
}