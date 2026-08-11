import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(hcfCal(a,b));

    }
    public static int hcfCal(int a, int b){
        if(b ==0){
            return a;
        }
        return hcfCal(b, a%b);
    }
}
