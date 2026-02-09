import java.util.*;
public class RailFence {
    public static void main(String[] args) {
        String s = "anik is a good   student";
        int d = 4;
        System.out.println(RailFenceEncrypt(s, d));

    }
    public static String RailFenceEncrypt(String s, int d) {
        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            List<Character> l = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                l.add('\0');
            }
            list.add(l);
        }
        int  j =0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            list.get(j).set(i, s.charAt(i));
            if (down == true) {
                j++;
                if (j == d - 1) {
                    down = false;
                }
            } else {
                j--;
                if (j == 0) {
                    down = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> row : list) {
            for (char c : row) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
