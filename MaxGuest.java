public class MaxGuest {
    public static void main(String[] args) {
        int[]  enter= {7,0,5,1,3};
        int[] leave={1,2,1,3,4};
        int guest=0,max=0;
        for(int i=0;i<leave.length;i++){
             guest=guest+enter[i]-leave[i];
            if(max<guest){
                max=guest;
            }
        }
        System.out.println(max);
    }
}
