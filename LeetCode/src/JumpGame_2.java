public class JumpGame_2 {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(jump(arr));
    }
    public static int jump(int[] nums) {
        int max = 0;
        int count = 0;
        int current =0;
        for(int i = 0; i<nums.length-1; i++){
            max = Math.max(max, i+nums[i]);
            if(i==current){
                count++;
                current=max;
            }
        }
        return count;
    }
}
