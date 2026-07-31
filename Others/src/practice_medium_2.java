import java.util.*;
public class practice_medium_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    }
    public static int operation_1(int sum, int value){
        return sum - value;
    }
    public static int operation_2(int sum, int X, int Y, int Z, int value){
        int x= X-1;
        int y= Y-1;
        sum = sum + value*x*y*Z;
        return sum; 
    }
    public static int operation_3(int sum, int X, int Y, int Z, int value){
        int y = Y-1;
        int  z = Z-1;
        sum = sum + value* X*y*z;
        return sum;
    }
}
