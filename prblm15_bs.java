public class prblm15_bs {
    static int search(int[] arr, int st, int end, int target) {

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < arr[end]) {
                if (arr[mid] < target && arr[end] >= target) {
                    st = mid + 1;

                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[st] <= target && arr[mid] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(search(arr, 0, arr.length - 1, 12));
        // display(arr);
    }
}
