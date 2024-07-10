import java.util.*;
// import java.lang.*;
// import java.io.*;

public class problem17_bs {
    public static int coins(int coins) {
        int st = 0;
        int end = 1000;
        int ans = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (sum(mid) <= coins) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

    static int sum(int mid) {
        int sa = ((mid) * (mid + 1)) / 2;
        return sa;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int inputs = sc.nextInt();
        // while (inputs > 0) {
        // int coin = sc.nextInt();
        System.out.println(coins(2));
        // inputs--;
    }
}
