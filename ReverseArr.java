public class ReverseArr {
    public static void main(String[] args) {
        int[] arr={1,1,7,3,8,5,8};
        int[] narr=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            narr[j++]=arr[i];
        }
        System.out.println("REVERSE ARRAY");
        for(int i=0;i<arr.length;i++){
            System.out.print(narr[i]+" ");
        }
    }
}
