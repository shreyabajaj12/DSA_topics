public class prblm13_bs {
    static int bs(int[] arr, int st, int end) {
        // int a = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[mid] > arr[arr.length - 1]) {
                st = mid + 1;
            } else if (arr[mid] < arr[arr.length - 1]) {
                end = mid - 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 1, 2, 3, 4, 5 };
        System.out.println(bs(arr, 0, arr.length - 1));
    }
}
