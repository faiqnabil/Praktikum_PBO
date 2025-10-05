package Percobaan4;

public class Anjing extends Mamalia {
    String jenis;
    String warnaBulu;

    public Anjing(String nama, int umur, String jenis, String warnaBulu) {
        super(nama, umur);
        this.jenis = jenis;
        this.warnaBulu = warnaBulu;
        System.out.println("Konstruktor Anjing dipanggil");
    }

    public void menggonggong() {
        System.out.println(nama + " menggonggong: Guk guk guk!");
    }

    public void bermain() {
        System.out.println(nama + " sedang bermain bola");
    }

    public void menunjukkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}