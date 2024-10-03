import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {
        int ni=0,ne=0;
        Scanner sc= new Scanner(System.in);
        ni=sc.nextInt();
        ne=sc.nextInt();
        float[] intarr = new float[ni];
        System.out.println("Enter Square feet of Interier wall:");
        for (int i=0;i<ni;i++){
            intarr[i]=sc.nextFloat();
        }float[] extarr = new float[ne];
        System.out.println("Enter Square feet of Exterier wall:");
        for (int i=0;i<ne;i++){
            extarr[i]=sc.nextFloat();
        }
        float areain=0,areaout=0;
        for (int i=0;i<ni;i++){
            areain+=intarr[i];
        }
        for (int i=0;i<ne;i++){
            areaout+=extarr[i];
        }
        System.out.println(areain*18+areaout*12);
    }
}
