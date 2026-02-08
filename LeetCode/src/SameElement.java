import java.util.Scanner;

public class SameElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = sameElement(n,arr);
        System.out.println(ans);
        sc.close();
    }
    public static int sameElement(int n, int[] arr){
        int high = arr[0];
        for(int i =0;i<n;i++){
            if(high<arr[i]){
                high = arr[i];
            }
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum + (high-arr[i]);
        }
        return sum;
    }
}
