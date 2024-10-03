import java.util.Scanner;

public class SubArrSum {
    public static void main(String[] args) {
        int[] arr={3,4,-7,1,3,3,1,-4};
        System.out.println("ENTER TARGET SUM OF SUBARRAY");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                if (sum == target) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
    }
}
    }
