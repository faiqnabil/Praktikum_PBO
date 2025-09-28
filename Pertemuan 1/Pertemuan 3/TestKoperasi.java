import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nomor KTP: ");
        String nomorKTP = input.nextLine();
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan limit pinjaman: ");
        int limitPinjaman = input.nextInt();

        Anggota anggota = new Anggota(nomorKTP, nama, limitPinjaman);

        System.out.println("Nama Anggota: " + anggota.getNama());
        System.out.println("Limit Pinjaman: " + anggota.getLimitPinjaman());
        
        System.out.print("Masukkan jumlah pinjaman pertama: ");
        int pinjaman1 = input.nextInt();
        System.out.println("\nMeminjam uang " + pinjaman1 + "...");
        anggota.pinjam(pinjaman1);
        System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());
        
        System.out.print("Masukkan jumlah pinjaman kedua: ");
        int pinjaman2 = input.nextInt();
        System.out.println("\nMeminjam uang " + pinjaman2 + "...");
        anggota.pinjam(pinjaman2);
        System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());
        
        System.out.print("Masukkan jumlah angsuran pertama: ");
        int angsuran1 = input.nextInt();
        System.out.println("\nMembayar angsuran " + angsuran1);
        anggota.angsur(angsuran1);
        System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());
        
        System.out.print("Masukkan jumlah angsuran kedua: ");
        int angsuran2 = input.nextInt();
        System.out.println("\nMembayar angsuran " + angsuran2);
        anggota.angsur(angsuran2);
        System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());
        
        input.close();
    }
}