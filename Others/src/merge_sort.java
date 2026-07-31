import java.util.*;
public class merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // int[] sort = merge_sort(n, arr);
        // insertionSort(arr, n);
        // for(int j : arr){
        //     System.out.println(j);
        // }

        // merge_sort(arr, 0, n-1);
        // quick_sort(arr, 0, n-1);
        // merge_sort_2(arr,0, n-1);
        quick_sort_2(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));

    }
    // public static int[] insertionSort(int[] arr, int n){
    //     for(int i = 0; i<n-1; i++){
    //         int j = i;
    //         while(j > 0 && arr[j-1] > arr[j]){
    //             int temp = arr[j-1];
    //             arr[j-1] = arr[j];
    //             arr[j] = temp;
    //             j--;
    //         }
    //     }
    //     return arr;
    // }


    public static void merge_sort( int[] arr, int start, int end){
        if(start >= end) return;
        int mid = start + (end - start) / 2;
        merge_sort(arr, start, mid);
        merge_sort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int[] newArr = new int[(end - start + 1)];
        int left = start; 
        int right = mid+1;
        int i = 0;
        while(left <=  mid && right <= end){
            if(arr[left] <= arr[right]){
                newArr[i] = arr[left];
                i++;
                left++;
            }else{
                newArr[i] = arr[right];
                right++;
                i++;
            }
        }
        while(left <= mid){
            newArr[i]= arr[left];
            i++;
            left++;
        }
        while(right <= end){
            newArr[i] = arr[right];
            right++;
            i++;
        }
        for(int j = 0; j < newArr.length; j++){
            arr[start + j] = newArr[j];
        }
    }
    public static void quick_sort(int[] arr, int low, int high){
        if(low>=high) return;
        int pivot  = quicksort_func(arr, low, high);
        quick_sort(arr, low, pivot-1);
        quick_sort(arr, pivot+1, high);
    }
    public static int quicksort_func(int[] arr, int low, int high){
        int i = low;
        int j = high;
        int p = arr[low];
        while(i < j){
            while( i <= high-1 &&arr[i] <= p  ){
                i++;
            }
            while( j >= low +1 && arr[j] > p ){
                j--;
            }
            if(i< j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;
        return j;
    }
    public static void merge_sort_2(int[] arr, int start, int end){

        if(start >= end) return;
        int mid = start+(end - start) /2;
        merge_sort_2(arr, start, mid);
        merge_sort_2(arr, mid+1, end);
        merge_2(arr, start,mid, end);
    }
    public static void merge_2(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid+1;
        int[] arr_2 = new int[end-start+1];
        int i = 0;
        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                arr_2[i++] = arr[left++];
            }else{
                arr_2[i++] = arr[right++];
            }
        }
        while(left <= mid){
            arr_2[i++] = arr[left++];
        }
        while(right<=end){
            arr_2[i++] = arr[right++];
        }
        for(int j= 0; j<arr_2.length; j++){
            arr[start + j] = arr_2[j];
        }
    }
    public static void quick_sort_2(int[] arr, int start, int end){
        if(start>= end) return;
        int pivot = quick_sort_func_2(arr, start, end);
        quick_sort_2(arr, start, pivot-1);
        quick_sort_2(arr, pivot+1, end);
    }
    public static int quick_sort_func_2(int[] arr, int low, int high){
        int left = low;
        int right  = high;
        int p = arr[low];
        while(left < right){
            while(left<= high -1 && arr[left] <=p){
                left++;
            }
            while(right >= low+1 && arr[right] > p){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[low] = arr[right];
        arr[right] = p;
        return right;
    }
}
