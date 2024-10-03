public class NumberOfVehical {
    public static void main(String[] args) {
        int TotalVehical=200;
        int TotalWheel=540;
        int TwoWheeler=(4*TotalVehical-TotalWheel)/2;
        int FourWheeler=(TotalWheel-2*TotalVehical)/2;
        System.out.println("NUMBER OF TWO WHEELER\t"+TwoWheeler);
        System.out.println("NUMBER OF FOUR WHEELER\t"+FourWheeler);
    }
}
