import java.util.Scanner;

public class Amcat_3_Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String input = sc.nextLine();
        Amcat_3_Ques_1 obj = new Amcat_3_Ques_1();
        int ans = obj.ErrorCount(input);
        System.out.println(ans);

    }
    public int ErrorCount(String textInput){
        char[] arr = textInput.toCharArray();
        int count = 0;
        for(char c : arr){
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                count++;
            }
        }
        return count;
    }
}
