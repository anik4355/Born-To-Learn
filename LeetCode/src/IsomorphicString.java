
import java.util.HashMap;
import java.util.HashSet;

class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                if (used.contains(charT)) {
                    return false;  // If the character in 't' is already used
                }
                map.put(charS, charT);
                used.add(charT);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        IsomorphicString ob = new IsomorphicString();
        String s = "paper";
        String t = "title";
        boolean ans = ob.isIsomorphic(s, t);
        System.out.println(ans);
    }
}
