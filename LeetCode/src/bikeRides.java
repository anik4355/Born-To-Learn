import java.util.Scanner;
import java.util.Stack;

public class bikeRides {
    public static int goodSum(int N, int[] A) {
        // Write your logic here
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<N; i++){
            if(A[i] < 0){
                int v = Math.abs(A[i]);
                int sum = 0;
                while(sum < v && !st.isEmpty()){
                    sum = sum + st.pop();
                }
                st.push(v);
            }else{
                st.push(A[i]);
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum = sum + st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // First input is the integer N
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();  // Remaining input is the array of integers
        }

        // Call user logic function and print the output
        int result = goodSum(N, A);
        System.out.println(result);
        sc.close();
    }
}
