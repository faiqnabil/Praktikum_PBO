package Percobaan4;

public class Kucing extends Mamalia {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); 
    
        this.ras = ras; 
        
        System.out.println("Konstruktor Kucing dipanggil");
    }
}