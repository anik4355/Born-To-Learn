import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArraySumEqualMultiply {
    public static void main(String[] args) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test case : ");
        int T = sc.nextInt();
        System.out.println("Enter the numbers : ");
        for(int i =0;i<T; i++){
            List<Integer> l = new ArrayList<>();
            System.out.println("Enter the total numbers :");
            int n = sc.nextInt();
            System.out.println("Enter the list elements :");
            for(int j = 0; j<n; j++){
                l.add(sc.nextInt());
            }
            list.add(l);
        }
        List<Integer> ans = numberOfpossiblity(T, list);
        for(int p = 0; p< list.size(); p++){
            System.out.println(ans.get(p));
        }
        
    }
    public static List<Integer> numberOfpossiblity(int T, ArrayList<List<Integer>> list ){
        List<Integer> l= new ArrayList<>();
        for(int i = 0; i< T; i++){
            int count  = 0;
            int k = 0;
            while(k < list.get(i).size()){
                int j = k;
                int sum = 0;
                int mul = 1;
                while(j < list.get(i).size()){
                    sum += list.get(i).get(j);
                    mul = mul * list.get(i).get(j);
                    if(sum == mul){
                        count ++;
                    }
                    j++;
                }
                k++;
            }
            l.add(count);

        }
        return l;
    }
}
