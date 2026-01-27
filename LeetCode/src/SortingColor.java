public class SortingColor {
    public static void sortColors(int[] nums) {
        int p = 0;
        int q = 0;
        int r = nums.length-1;
        while(q<=r){
             if(nums[q] == 0){
                 int temp = nums[p];
                 nums[p] = nums[q];
                 nums[q] = temp;
                 p++;
                 q++;
             }else if(nums[q] == 1){
                 q++;
             }else{
                 int t = nums[q];
                 nums[q] = nums[r];
                 nums[r] = t;
                 r--;
             }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.println(num);
        }
    }

}
