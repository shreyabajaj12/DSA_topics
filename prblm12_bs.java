public class prblm12_bs {
    static int follow(int[] arr, int st, int end, int x) {

        int res = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == x) {
                res = mid;
                st = mid + 1;
            }

            else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 4, 4, 4, 6, 6 };
        int b = follow(arr, 0, arr.length - 1, 4);
        System.out.println(b);
    }
}
