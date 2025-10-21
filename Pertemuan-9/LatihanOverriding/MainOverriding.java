public class MainOverriding {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM OVERRIDING - DYNAMIC METHOD DISPATCH ===\n");
        
        System.out.println("1. OBJEK MANUSIA:");
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        System.out.println();
        
        System.out.println("2. OBJEK DOSEN (Normal):");
        Dosen dosen = new Dosen();
        dosen.bernafas();  
        dosen.makan();     
        dosen.lembur();    
        System.out.println();
        
        System.out.println("3. OBJEK MAHASISWA (Normal):");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.bernafas();  
        mahasiswa.makan();     
        mahasiswa.tidur();     
        System.out.println();
        
        System.out.println("=== DYNAMIC METHOD DISPATCH ===\n");
        
        System.out.println("4. DYNAMIC DISPATCH - DOSEN:");
        Manusia manusia2 = new Dosen(); 
        manusia2.bernafas();
        manusia2.makan();  
        System.out.println("   Note: Method lembur() tidak dapat diakses karena tipe referensi adalah Manusia");
        System.out.println();
        
        System.out.println("5. DYNAMIC DISPATCH - MAHASISWA:");
        Manusia manusia3 = new Mahasiswa();
        manusia3.bernafas();
        manusia3.makan();  
        System.out.println("   Note: Method tidur() tidak dapat diakses karena tipe referensi adalah Manusia");
        System.out.println();
        
        System.out.println("6. POLYMORPHIC ARRAY:");
        Manusia[] arrayManusia = new Manusia[3];
        arrayManusia[0] = new Manusia();
        arrayManusia[1] = new Dosen();
        arrayManusia[2] = new Mahasiswa();
        
        for (int i = 0; i < arrayManusia.length; i++) {
            System.out.println("   Objek ke-" + (i + 1) + ":");
            arrayManusia[i].makan();  
        }
        System.out.println();
        
        System.out.println("7. METHOD DENGAN PARAMETER POLIMORFISME:");
        lakukanAktivitas(new Manusia());
        lakukanAktivitas(new Dosen());
        lakukanAktivitas(new Mahasiswa());
        
        System.out.println("\n=== PROGRAM SELESAI ===");
    }
    public static void lakukanAktivitas(Manusia m) {
        System.out.println("   Aktivitas:");
        m.bernafas();
        m.makan(); 
        System.out.println();
    }
}
