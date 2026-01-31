// Boyer-Moore Algorithm


public class MajorityElement {
    public static void main(String[] args) {
        int[] arr= {1,2,2,2,1,1,1,3,3};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int c = 0;
        int i = 0;
        for(int num : nums){
            if(c == 0){
                i = num;
            }
            if(num == i){
                c++;
            }else{
                c--;
            }
        }
        return c;
    }
}
