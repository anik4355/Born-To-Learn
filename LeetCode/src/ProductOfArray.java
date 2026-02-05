public class ProductOfArray {
    public static void main(String[] args) {
        ReturnArray ans = new ReturnArray();
        int[] arr = {1,2,3,4};
        int[] finalArr = ans.productExceptSelf(arr);
        for (int num : finalArr){
            System.out.println(num);
        }
    }
}
class ReturnArray{
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i<nums.length; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }
        int j  = 1;
        for(int i = nums.length -1; i>= 0; i--){
            arr[i] = arr[i] *  j;
            j = j * nums[i];
        }

        return arr;
    }
}
