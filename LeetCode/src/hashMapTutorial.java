import java.util.HashMap;

public class hashMapTutorial {
    public static void main(String[] args) {
        HashMap<Integer,  Integer>  map = new HashMap<>();
        map.put(10,1);
        map.put(20,2);
        map.put(30,2);
        System.out.println(map);
        System.out.println(map.get(30));
        System.out.println(map.containsKey(20));

    }
}
