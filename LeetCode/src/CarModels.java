import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CarModels {

    public static int countConsistentCars(String components, int n, List<String> models) {
        // User logic goes here
        Set<Character> set = new HashSet<>();
        for( char c : components.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for( String s : models){
            boolean ans = true;
            for( char c : s.toCharArray()){
                if(!set.contains(c)){
                    ans = false;
                    break;
                }
            }
            if(ans){
                count++;
            }
        }

        return count;  // Placeholder return value
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String components = reader.readLine().trim();
        int n = Integer.parseInt(reader.readLine().trim());
        List<String> models = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            models.add(reader.readLine().trim());
        }
        int result = countConsistentCars(components, n, models);
        System.out.println(result);
    }
}
