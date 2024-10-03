public class SumOfCube {
    public static void main(String[] args) {
        int sum = 0;
        int init=4,end=9;
        for(int i=init;i<=end;i++){
            int cube=i*i*i;
            sum+=cube;
        }
        System.out.println(sum);
    }
}
