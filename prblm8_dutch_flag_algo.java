public class prblm8_dutch_flag_algo {
    static void printarr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = i;
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, mid, st);
                st++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, end);
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0 };
        sort(arr);
        printarr(arr);

    }
}
