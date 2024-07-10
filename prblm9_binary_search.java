public class prblm9_binary_search {
    static boolean search(int[] arr, int st, int end, int target) {
        if (st > end)
            return false;
        int mid = (st + end) / 2;
        if (target == arr[mid])
            return true;
        else if (target > arr[mid]) {
            return search(arr, mid + 1, end, target);
        } else {
            return search(arr, st, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 20 };
        System.out.println(search(arr, 0, arr.length - 1, 90));
    }
}
