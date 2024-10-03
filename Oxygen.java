public class Oxygen {
    public static void main(String[] args) {
        int[] arr={95, 92, 95, 92, 90, 92, 90, 92, 90};
        int trainee1=0,trainee2=0,trainee3=0;
        for(int i=0; i<3; i+=3){
            trainee1= arr[i]+trainee1;
        }
        for(int i=1; i<4; i+=3){
            trainee2= arr[i]+trainee2;
        }
        for(int i=2; i<5; i+=3){
            trainee3= arr[i]+trainee3;

        }
        int res=Math.max(trainee1/3,trainee2/3);
        int res1=Math.max(res,trainee3/3);
        System.out.println(res1);
        if(res1==trainee1/3){
            System.out.println("Trainee Number : 1");
        }
        if(res1==trainee2/3){
            System.out.println("Trainee Number : 2");
        }
        if(res1==trainee3/3){
            System.out.println("Trainee Number : 3");
        }
    }
}
