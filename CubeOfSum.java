import java.util.Scanner;

public class CubeOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += Math.pow(i,3);
        }
        System.out.println("The sum is "+sum);
    }
}
