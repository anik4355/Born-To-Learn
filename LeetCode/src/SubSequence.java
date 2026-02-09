public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "phbabc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        while (i < t.length()-s.length()) {
            int k = 0;
            int j = i;
            while (j < t.length() && i + s.length() <= t.length()) {
                if (t.charAt(j) == s.charAt(k)) {
                    k++;
                    if (k >= s.length()) {
                        return true;
                    }
                }
                j++;
            }
            i++;
        }
        return false;
        
    }
}
