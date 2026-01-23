public class Next_Permutation_31 {
    public static void main(String[] args) {
        int[] arr = {1};
        nextPermutation(arr);

    }
    public static void nextPermutation(int[] nums){
        int l = nums.length;
        int k = -1;
        for(int i = l-1;i>0;i--){
            if(nums[i-1] < nums[i]){
                k = i-1;
                break;
            }
        }
        if(k == -1){
            int left = 0;
            int right = l-1;
            while(left<right){
                int  temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right --;
            }
        }else{
            int p = 0;
            for(int i = l-1;i>k;i--){
                if(nums[k] <nums[i]){
                    p = i;
                    break;
                }
            }
            int temp = nums[k];
            nums[k] = nums[p];
            nums[p] = temp;
            int left = k+1;
            int right = l-1;
            while(left<right){
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                left++;
                right--;
            }
        }
        for(int m : nums){
            System.out.println(m);
        }
//        System.out.println(k);

    }

}
