import java.util.Stack;

public class paranthesisChecking {

    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        if(s.length() == 1 || s.isEmpty()) return false;
//        list.push(s.charAt(0));
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(list.isEmpty()) return false;
                if(list.get(list.size() -1) == '('){
                    list.pop();
                }else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if(list.isEmpty()) return false;
                if(list.get(list.size()-1) == '{'){
                    list.pop();
                }else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if(list.isEmpty()) return false;
                if(list.get(list.size()-1) == '['){
                    list.pop();
                }else {
                    return false;
                }
            }else{
                list.push(s.charAt(i));
            }
        }
        if(list.isEmpty()){
            return true;
        }else{
         return false;
        }
    }
}
