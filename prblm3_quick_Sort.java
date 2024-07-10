public class prblm3_quick_Sort {
    public static void sortaarray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] < pivot)
                count++;
        }
        int piviotidx = st + count;
        swap(arr, st, st + count);
        int i = st;
        int j = end;
        while (i < piviotidx && j > piviotidx) {
            while (arr[i] <= arr[piviotidx])
                i++;
            while (arr[j] > arr[piviotidx])
                j--;
            if (i < piviotidx && j > piviotidx) {
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return piviotidx;

    }

    public static void partitionidx(int[] arr, int st, int end) {
        if (st >= end)
            return;
        int pi = partition(arr, st, end);
        partitionidx(arr, st, pi - 1);
        partitionidx(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 5, 8, 7, 6 };
        partitionidx(arr, 0, arr.length - 1);
        sortaarray(arr);
    }
}
