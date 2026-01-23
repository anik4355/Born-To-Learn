import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int n = -2;
        System.out.println(threeSumClosest(nums,n));
    }
    public  static int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int closer = target;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length -1;
            while(left<right){
                int sum = nums[i] + nums[right] + nums[left];
                int d = Math.abs((sum)-(target));
                if(d<diff){
                    closer = sum;
                    diff = d;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return closer;

    }
}
