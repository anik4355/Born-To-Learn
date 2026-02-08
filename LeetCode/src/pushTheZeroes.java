// import java.util.Scanner;
// import java.util.*;

public class pushTheZeroes {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int n = 8;
        int[] arr = {0,0,1,0,2,0,3,0};

//        for(int i = n-1; i>=0;i--){
//            if(arr[i] == 0){
//                int j = i;
//                while(arr[j] != 0 || j<n-1){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                    j++;
//                }
//            }
//        }
        int j = 0;
        for(int i = 0; i<n;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j] = 0;
            j++;
        }
        for( int i : arr){
            System.out.println(i);
        };
    }
}
