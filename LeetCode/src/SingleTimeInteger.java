import java.util.HashSet;
import java.util.Set;

public class SingleTimeInteger {
    public static void main(String[] args) {
        int[] arr = {4,1,2,2,1};
        int a = singleNumber(arr);
        System.out.println(a);

    }
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}
