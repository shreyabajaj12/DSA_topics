public class prblm10_bs {
    static int bs(int[] arr, int target, int st, int end) {

        int res = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
        System.out.println(bs(arr, 6, 0, arr.length - 1));
        // System.out.println("bf,fbvuvfkbmvkwjdn cs cwurbri vrybiebwf");

    }
}
