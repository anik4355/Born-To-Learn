import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
       Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            map.put(c,map.getOrDefault(c,0) +1);
        }
        char[] arr_t = t.toCharArray();
        for(char c : arr_t){
            if(map.containsKey(c)){
                System.out.println(c);
                System.out.println(map.get(c));
                
                map.put(c,map.get(c) -1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
                System.out.println(map.get(c));
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        Anagram an = new Anagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(an.isAnagram(s, t));
    }

}
