public class ValidString {
    public static void main(String[] args) {
        int NoofStar=0;
        int NoofHash=0;
        String str="###***";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                NoofStar++;
            }
            else if(str.charAt(i)=='#'){
                NoofHash++;
            }
        }
        if(NoofStar==NoofHash){
            System.out.println("0");
        } else if (NoofStar>NoofHash) {
            System.out.println("positive integer");
        }
        else {
            System.out.println("negative integer");
        }
    }
}
