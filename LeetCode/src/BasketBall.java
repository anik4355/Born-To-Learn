// import java.util.Objects;
import java.util.Stack;
import java.util.Scanner;
public class BasketBall {
    public static int userLogic(String[] ops) {
        Stack<Integer> st = new Stack<>();
//        if(ops.length == 1){
//            if(Integer.parseInt(ops[0]) > 0){
//                return Integer.parseInt(ops[0]);
//            }else{
//                return 0;
//            }
//        }
        for (int i = 0; i < ops.length; i++) {

            if (ops[i].equals("C")) {
                st.pop();

            } else if (ops[i].equals("D")) {
                st.push(st.peek() * 2);

            } else if (ops[i].equals("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);

            } else {
                st.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }

        return sum; // Placeholder return statement
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Input for number of operations
        String[] ops = new String[n];

        // Input array of operations
        for (int i = 0; i < n; ++i) {
            ops[i] = scanner.next();
        }

        // Call user logic function and print the output
        int result = userLogic(ops);
        System.out.println(result);
        scanner.close();
    }
}
