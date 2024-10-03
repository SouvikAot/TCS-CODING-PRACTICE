import java.util.Scanner;

public class MaxRow {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];
        int row=0,col=0,maxrow=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
        System.out.println("Enter the number of columns");
        col=sc.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0,count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxrow=i+1;
            }
        }
        System.out.println("Max 1 in Row"+maxrow);
    }
}
