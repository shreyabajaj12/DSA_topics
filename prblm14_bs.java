public class prblm14_bs {
    static int bs(int[] arr, int st, int end, int target, int dis) {
        // int dis = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[mid + 1]) {
                dis = mid + 1;
            } else if (arr[mid] > arr[arr.length - 1]) {
                st = mid + 1;
            } else if (arr[mid] < arr[arr.length - 1]) {
                end = mid - 1;
            }
        }
        if (st < dis) {
            int mid = (st + (dis - 1)) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = dis - 1;
            }
        } else {
            int mid = (dis + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = dis - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(bs(arr, 0, arr.length - 1, 4, 0));

    }
}
