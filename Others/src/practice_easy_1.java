import java.util.*;
public class practice_easy_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n; i++){
            arr[i]= sc.nextInt();
        }
        int q = sc.nextInt();
        int[][] arr2 = new int[4][q];
        for(int i = 0; i<q; i++){
            for(int j = 0; j<4; j++){
                arr2[j][i] = sc.nextInt();
            }
        }
        for(int i = 0; i<q; i++){
            arr = updateArr(arr, arr2[0][i], arr2[1][i], arr2[2][i], arr2[3][i]);
        }
        int sum = 0;
        for(int k : arr){
            sum += k;
        }
        System.out.println(sum);

    }
    public static int[] updateArr(int[] arr, int l, int r, int x,int y){
        for(int i = 0; i<=r-l; i++){
            
            arr[l+i] = x + i*y;
        }
        return arr;
    }
}
