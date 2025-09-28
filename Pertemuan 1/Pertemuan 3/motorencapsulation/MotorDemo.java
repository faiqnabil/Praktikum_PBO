package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        System.out.println("=== TEST BATAS MAKSIMAL 100 ===");
        
        for (int i = 1; i <= 20; i++) {
            motor.tambahKecepatan();
        }
        motor.printStatus();
        
        System.out.println("Coba tambah kecepatan saat sudah maksimal:");
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.printStatus();
        
        System.out.println("Kurangi kecepatan dari maksimal:");
        motor.kurangiKecepatan();
        motor.kurangiKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}