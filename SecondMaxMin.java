import java.util.*;
public class SecondMaxMin {
        public static void main(String[] args) {
            int[] arr={1,1,7,3,8,5,8};
            Arrays.sort(arr);
            int min=arr[0];
            int max=arr[arr.length-1];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>min){
                    System.out.println("SECOND SMALLEST: "+arr[i]);
                    break;
                }
            }
            for(int i=arr.length-1;i>0;i--){
                if(arr[i]<max){
                    System.out.println("SECOND LARGEST: "+arr[i]);
                    break;
                }
            }
        }
    }

