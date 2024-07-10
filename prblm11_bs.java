public class prblm11_bs {
    static int sqroot(int st, int end, int x) {
        int ans = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;

            if (val == x) {
                return mid;
            } else if (val > x) {
                end = mid - 1;
            } else {
                st = mid + 1;
                ans = mid;

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int a = sqroot(0, 24, 24);
        System.out.println(a);
    }
}
