import java.util.*;
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int j = 1;
    int bin = 0;
    for(int i = n; i>0; i = i/2){
        bin = bin + (n%2) * j;
        j = j * 10;
        n = n/2;
    }
    System.out.print(bin);
    
}