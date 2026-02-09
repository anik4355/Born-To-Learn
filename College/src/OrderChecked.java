import java.util.Arrays;
import java.util.Scanner;

public class OrderChecked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = indexMiss(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int indexMiss(int[] arr){
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        Arrays.sort(newArr);
        int count  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != newArr[i]){
                count++;
            }
        }
        return count;
    }
}
