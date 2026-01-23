import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfDiffBits {
    public static long compareBits(String a, String b) {
        // User logic goes here
//        Set<Character> test = new HashSet<>();
        char[] test = a.toCharArray();
        int r = test.length;
        char[] bit = b.toCharArray();
        int l = bit.length;

        long totalsum = 0;
        for(int i =0 ;i< l-r+1;i++){
            for(int j = i;j<r+i;j++){
                if(bit[j] != test[j-i]){
                    totalsum++;
                }
            }
        }
        return totalsum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
//        String b = scanner.next();
//        System.out.println(compareBits(a, b));
        System.out.println(compareBits("101", "11001"));

    }

}
