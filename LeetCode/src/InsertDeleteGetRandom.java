import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet rs = new RandomizedSet();

        System.out.println(rs.insert(1));
        System.out.println(rs.remove(2));
        System.out.println(rs.insert(2));
        System.out.println(rs.getRandom());
        System.out.println(rs.remove(1));
        System.out.println(rs.insert(2));
        System.out.println(rs.getRandom());
    }

}
class RandomizedSet{
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();

    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;

        list.add(val);
        map.put(val, list.size() -1);
        return true;

    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int index = map.get(val);
        int last = list.getLast();
        list.set(index, last);
        map.put(last, index);
        list.removeLast();
        map.remove(val);
        return true;



    }

    public int getRandom() {
        int random = rand.nextInt(list.size() );
        return list.get(random);

    }
}