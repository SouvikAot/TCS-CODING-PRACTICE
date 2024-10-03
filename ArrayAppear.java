import java.util.Arrays;

public class ArrayAppear {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        int[] arr={4,1,2,1,2};
        Arrays.sort(arr);
       // int count=0;
        int n=arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for(int k=0;k<j;k++){
          //  System.out.print(temp[k]+" ");
        }

        for(int k=0;k<j;k++){
            int count=0;
            for(int l=0;l<n;l++){
                if(temp[k]==arr[l]){
                    count++;
                }
            }
            if(count<2){
                System.out.println(temp[k]);
            }
        }
        }
    }

