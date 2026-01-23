import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class printingColor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("totals :");
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            System.out.println("length :");
            int N = Integer.parseInt(br.readLine());
            System.out.println("String :");
            String s = br.readLine();
            char r = 'R', b = 'B', w = 'W';
            boolean ans = true;
            StringBuilder sb = new StringBuilder();
            if(N == 0  || N == 1){
                System.out.println("NO");
                continue;
            }
            for(int i = 0; i<N; i++){
                if(s.charAt(i) == w){
                    if(sb.length() > 0 && (sb.toString().indexOf(r) == -1 || sb.toString().indexOf(b) == -1)){
                        ans = false;
                        break;
                    }
                    sb = new StringBuilder();
                }else{
                    sb.append(s.charAt(i));
                }

            }
            if(sb.length() > 0  && (sb.toString().indexOf(r) == -1 || sb.toString().indexOf(b) == -1)){
                ans = false;
            }
            if(!ans){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }



    }


}
