public class prblm6_sorting {
    static void printarraay(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // static void sort(int[] arr) {
    // int st = 0;
    // int end = arr.length - 1;
    // while (st < end) {
    // if (arr[st] > 0 && arr[end] < 0) {
    // int temp = arr[st];
    // arr[st] = arr[end];
    // arr[end] = temp;
    // st++;
    // end--;

    // } else if (arr[end] < 0 && arr[st] < 0) {
    // st++;

    // } else {
    // end--;
    // }
    // }
    // }
    static void sort(int[] arr, int pivot) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                count++;
            }

        }
        int pivotidx = (pivot + count) - 1;

        int i = 0;
        int j = arr.length - 1;

        while (i < pivotidx && j > pivotidx) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotidx && j > pivotidx) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { -20, 19, 7, -4, -13, 11, -5, 3 };
        sort(arr, 0);
        printarraay(arr);

    }
}