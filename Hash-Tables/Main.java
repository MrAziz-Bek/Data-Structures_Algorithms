import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // map.put(1, "Aziz");
        // map.put(2, "John");
        // map.put(2, "Marry");
        // map.put(null, null);
        // map.remove(null);
        // System.out.println(map);

        // for (var item : map.entrySet())
        // System.out.println(item.getKey());
        // var str = "a green apple";
        // var finder = new CharFinder();
        // System.out.println(finder.findFirstNonRepeatingChar(str));
        // System.out.println(finder.findFirstRepeatedChar(str));

        // Set<Integer> set = new HashSet<>();
        // int[] numbers = { 1, 2, 3, 3, 2, 1, 4 };
        // for (var number : numbers) {
        //     set.add(number);
        // }

        // System.out.println(set);

        HashTable table = new HashTable(5);

        table.put(1, "Aziz");
        table.put(6, "Wahid");
        table.put(1, "Aziz B.");

        System.out.println(table.get(6));
        table.remove(6);
        System.out.println(table.get(6));
    }
}