import java.util.*;
public class reverseString {
    public static String transformString(String s, char ch) {
        // Write your logic here.
        int l = s.length() - 1 ;
        while(l>=0){
            if(s.charAt(l) == ch){
                char[] arr = s.toCharArray();
                reverse(arr,l,s.length()-1);
                return (new String(arr));
            }
            l--;
        }

        return s;
    }
    public static void reverse(char[] arr, int i,int l){
            if(i>=l){
                return;
            }
            char temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            reverse(arr, i+1,l-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        String s = data[0];
        char ch = data[1].charAt(0);

        String result = transformString(s, ch);
//        String result = reverse(s)
        System.out.println(result);
    }
}
