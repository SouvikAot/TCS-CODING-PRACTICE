public class PrirorElement {
    public static void main(String[] args) {
        int max=0,count=0;
        int Arr[]={3,4,5,8,9};
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>max){
                max=Arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
