import java.util.*;
public class ArraySortOnFrequency {
    public static void main(String[] args) {
        int[] arr={1,1,1,5,5,2,2,2,3,3,3,3};
        int n=arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
