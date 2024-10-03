import java.util.Scanner;

public class Distance_Path {
    public static void main(String[] args) {
        String[]  arrs = {"TH" , "GA", "IC" , "HA" , "TE", "LU" ,"NI","CA"};
        int[] arr={800,600,750,900,1400,1200,1100,1500};
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String e= sc.nextLine();
        int x=0,y=0;
        for(int i=0;i<arr.length;i++){
            if(s.equals(arrs[i])){
                x=i;
            } else if (e.equals(arrs[i])) {
                y=i;

            }
        }
        int res=0;
        if(s.equals(e)){
            System.out.println("INVALID INPUT");
        }
        else{
            if(x<y) {
                for (int z = x; z <= y; z++) {
                    res += arr[z];
                }
            }
            else{
                for (int z = y; z <= x; z++) {
                    res += arr[z];
                }
            }
        }
        System.out.println(res*0.005);
    }
}
