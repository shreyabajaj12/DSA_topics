import java.util.*;

public class problem43_hashmap {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Raj", 19);
        mp.put("shreya", 19);
        mp.put("Rohit", 23);
        mp.put("yash", 90);
        mp.put("Ram", 39);
        System.out.println(mp.get("yash"));
        mp.put("yash", 12);
        System.out.println(mp.get("yash"));
        System.out.println(mp.remove("Raj"));
        System.out.println(mp.remove("Riya"));
        System.out.println(mp.containsKey("shreya")); /////
        mp.putIfAbsent("Raj", 22); /////
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue()); // new property in java
        }

    }
}
