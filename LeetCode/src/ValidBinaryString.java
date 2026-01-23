import java.util.Scanner;

public class ValidBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = validString(n);
        System.out.println(ans);
    }
    public static int validString(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 2;
        }else if(n == 2){
            return 3;
        }else{
            return validString(n-1) + validString(n-2);
        }

    }
}
