public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (nomor > 0 && nomor <= arrayKursi.length) {
            if (arrayKursi[nomor - 1].getPenumpang() == null) {
                arrayKursi[nomor - 1].setPenumpang(penumpang);
                System.out.println("Penumpang " + penumpang.getNama() + " berhasil ditempatkan di kursi " + nomor);
            } else {
                System.out.println("Kursi nomor " + nomor + " sudah terisi oleh " + 
                                 arrayKursi[nomor - 1].getPenumpang().getNama() + "!");
            }
        } else {
            System.out.println("Nomor kursi tidak valid! Harus antara 1 dan " + arrayKursi.length);
        }
    }
}