import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhonePad {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        Map<Character,String> list = new HashMap<>();
        list.put('2',"abc");
        list.put('3',"def");
        list.put('4',"ghi");
        list.put('5', "jkl");
        list.put('6',"mno");
        list.put('7',"pqrs");
        list.put('8',"tuv");
        list.put('9',"wxyz");
        // StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<digits.length();i++){
//            sb.append(list.get(digits.charAt(i)));
//        }
        List<String> ls = new ArrayList<>();
//        for(int i = 0; i<sb.length()-1;i++)
//        {
//            for( int j = i+1;j<sb.length();j++){
//                ls.add("" + sb.charAt(i) + sb.charAt(j));
//            }
//        }

        return ls;

    }
}
