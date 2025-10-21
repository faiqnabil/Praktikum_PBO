public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    public double keliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    public int getSudut() {
        return sudut;
    }
    
    public void setSudut(int sudut) {
        this.sudut = sudut;
    }
}