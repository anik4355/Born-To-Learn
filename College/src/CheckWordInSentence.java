
import java.util.Scanner;

public class CheckWordInSentence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        int ans = countWord(sentence, word);
        System.out.println(ans);

    }
    public static int countWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        char[] arr = sentence.toCharArray();
        char[] w = word.toCharArray();
        int c = 0;
        int answer = 0;
        while(c <= arr.length- w.length){
            if(arr[c] == w[0]){
                int j = 1;
                boolean ans = true;
                while(j < w.length){
                    if(arr[c+j] != w[j]){
                        ans = false;
                        break;
                    }
                    j++;
                }
                if(ans == true){
                    answer++;
                    ans = false;
                }

            }
            c++;
        }
        return answer;
    }
}
