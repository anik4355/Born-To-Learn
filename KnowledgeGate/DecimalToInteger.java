import java.util.*;
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    while(n!=1){
        int k = n%2;
        list.add(k);
        n = n/2;
    }
    list.add(n);
    Collections.reverse(list);
    System.out.print(list);
}