import java.util.*;
public class binarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        int ans = binarySearch(arr, value, 0, n-1);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int value, int start, int end){
        if(start > end){
             return -1;
        }
        int mid = start + (end - start) /2;
        if(arr[mid] == value){
            return mid;
        }
        if( value > arr[mid]){
            mid = binarySearch(arr, value, mid+1, end);
        }else{
            mid = binarySearch(arr, value, start, mid-1);
        }
        return mid;
    }
}
