import java.util.Arrays;

public class Ballon {
    public static void main(String[] args) {
        char[] arr={'r','g','b','b','g','y','y'};
        char[] newarr=new char[arr.length];
        int k=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]!=arr[i+1]){
                    newarr[k++]=arr[i];
            }
        }
        newarr[k++]=arr[arr.length-1];
        char res=' ';
        int max=0;
        for(int i=0;i<k;i++){
            int count=0;
            for(int j=0;j<arr.length;j++) {
                if (newarr[i] == arr[j]) {
                    count++;
                }
            }
                if(count%2!=0){
                    res=newarr[i];
                }
            }
        System.out.println(res);
    }
}
