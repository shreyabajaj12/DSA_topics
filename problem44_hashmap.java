import java.util.*;

public class problem44_hashmap {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 4, 1, 2, 4, 5, 6, 8, 1 };
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (!mp.containsKey(i)) {
                mp.put(i, 1);
            } else {
                mp.put(i, mp.get(i) + 1);
            }
        }
        System.out.println("frequency map");
        System.out.println(mp.entrySet());
        int maxfre = 0;
        int ans = 0;
        for (var key : mp.keySet()) {
            if (mp.get(key) > maxfre) {
                maxfre = mp.get(key);
                ans = key;
            }

        }
        System.out.println(maxfre);
        System.out.println(ans);
    }
}
