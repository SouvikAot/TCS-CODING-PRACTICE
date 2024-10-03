import java.util.Scanner;

public class CarFine {
    public static void main(String[] args) {
        System.out.println("NUMBER OF VEHICAL");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Start date");
        int date=sc.nextInt();
        int finecount=0;
        if(date%2==0){
            for(int i=0;i<n;i+=2){
                //System.out.println(arr[i]+" ");
                if(arr[i]%2!=0){
                    finecount++;

                }
            }
            for(int i=1;i<n;i+=2){
                if(arr[i]%2==0){
                    finecount++;
                }
            }
        }
        else{
            for(int i=0;i<n;i+=2){
                //System.out.println(arr[i]+" ");
                if(arr[i]%2==0){
                    finecount++;

                }
            }
            for(int i=1;i<n;i+=2){
                if(arr[i]%2!=0){
                    finecount++;
                }
            }
        }
        System.out.println("Enter fine amount");
        int fineamt= sc.nextInt();
        System.out.println("Fine amount: "+finecount*fineamt);
    }
}
