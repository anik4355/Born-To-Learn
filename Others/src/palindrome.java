import java.util.*;

public class palindrome {
    public static void main(String args[]){
        System.out.print("Enter your input :");
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        if(rev.equals(s)){
            System.out.println("Plaindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
