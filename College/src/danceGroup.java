
import java.util.Scanner;

public class danceGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = sc.next();
        System.out.println(numberOfPair(str));
    }   
    public static int numberOfPair(String str){
        if(str.length() == 1 || str.length() == 0) return 0;
        int i = 1;
        int count = 0;
        while(i< str.length()){
            if(str.charAt(i) != str.charAt(i-1)){
                count ++;
                i = i+2;
            }else{
                i++;
            }
        }
        return count;
    }
}

