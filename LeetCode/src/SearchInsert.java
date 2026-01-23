public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};

        int a = searchInsert(nums,7);
        System.out.println(a);
    }
    public  static int searchInsert(int[] nums, int target) {
        int start = 0;
        int last = nums.length -1;
        int index = 0;
        while(start <= last){
            int mid = start + (last - start) /2;
            if(nums[mid] == target){
                index =  mid;
                return index;
            } else if (nums[mid] > target) {
                last = mid -1;
            }else{
                start = mid+1;
            }
        }
        return start;

    }

}
