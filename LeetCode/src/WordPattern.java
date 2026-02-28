
import java.util.HashMap;
import java.util.HashSet;


public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.trim().split(" ");    
        if(pattern.length() == 0 || arr.length == 0 || pattern.length() != arr.length){
            return false;

        }
        HashMap <Character, String> map = new HashMap<>();
         HashSet<String> used = new HashSet<>();
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String st = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(st)){
                    return false;
                }
            }else{
                if(used.contains(st)){
                    return false;
                }
                map.put(c,st);
                used.add(st);
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String  pattern = "acba";
        String s = "dog cat cat dog";
        WordPattern wb = new WordPattern();
        System.out.println(wb.wordPattern(pattern, s));
    }

}
