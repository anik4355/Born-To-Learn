// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the budget : ");
        int bud = sc.nextInt();
        int ans1 = maximumNumber(arr,bud);
        System.out.println("Ans1 is : " + ans1);
        sc.close();

    }
    public static int maximumNumber(int[] arr, int bud){   // Same equal to the bud
        int i = 0;
        int c = 0;
        List<Integer> f = new ArrayList<>();
        while(i<arr.length){
            int sum = 0;
            int p = 0;

            List<Integer> list = new ArrayList<>();
            for(int j = i; j<arr.length;j++){
                sum = sum + arr[j];
                list.add(arr[j]);
                p++;
                if(sum>bud){
                    break;
                }else if(sum == bud){
                    if(p>c){
                        c = p;
                        f = list;
                        break;
                    }
                }
            }
            i++;
        }
        System.out.println(f);
        return c;
    }
}
