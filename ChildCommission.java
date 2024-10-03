import java.util.Scanner;

public class ChildCommission {
    public static void main(String[] args) {
       int SchemeAmount = 5000;
       String[] str={ };
       Scanner sc=new Scanner(System.in);
       String pa=sc.nextLine();
       String cg= sc.nextLine();
       String ch=sc.nextLine();
       str=ch.split(",");
       int len=str.length;
        System.out.println(len);
        if(ch=="N"||ch=="n"){
            System.out.println("COMMISSION DETAILS");
            System.out.println(SchemeAmount*5/100 + " INR");
        }
        else{
            System.out.println("COMMISSION DETAILS");
            System.out.println(len*SchemeAmount*10/100 + " INR");
        }
    }
}
