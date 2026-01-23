import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveReverseString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char[] arr = s.toCharArray();
        reverseString(arr, 0, arr.length - 1);

        System.out.println(new String(arr));
    }

    public static void reverseString(char[] arr, int i, int j) {

        if (i >= j) {
            return;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverseString(arr, i + 1, j - 1);
    }
}
