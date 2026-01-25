public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2,3};
        System.out.println(check(arr));


    }
    public static  boolean check(int[] arr){
        int n = arr.length;
        int c = 0;
        for(int  i = 0;i<arr.length;i++){
            if(arr[i] > arr[(i+1) % n]){
                c++;
            }
            if(c>1){
                return false;
            }
        }
        return true;
    }
}
