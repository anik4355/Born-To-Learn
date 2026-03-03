import java.util.HashMap;
import java.util.Map;

public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb =new StringBuilder();
        char[] st = identifier.toCharArray();
        boolean capital = false;
        Map<Character, Character> map = new HashMap<>();
        map.put('4','a');
        map.put('3','e');
        map.put('0','o');
        map.put('1','l');
        map.put('7','t');
        
        for(char c : st){
            if(capital == true){
                char ch = Character.toUpperCase(c);
                sb.append(ch);
                capital = false;
            }else if(c == ' '){
                sb.append('_');
            }else if(c == '-'){
                capital = true;
            }else if(map.containsKey(c)){
                sb.append(map.get(c));
            }else{
                if(Character.isLetter(c)){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // SqueakyClean sq = new SqueakyClean();
        String qs = "";
        String ans = clean(qs);
        System.out.println(ans);
    }
}
