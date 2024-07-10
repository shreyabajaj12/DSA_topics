public class prblm4_count_sort {
    public static void printarray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int maxele(int[] arr) {
        int a = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }
        }
        return a;
    }

    public static void countsort(int[] arr) {
        // int a = maxele(arr);
        int[] output = new int[arr.length];
        int[] count = new int[maxele(arr) + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 5, 3, 1, 3, 5 };
        countsort(arr);
        printarray(arr);

    }
}
