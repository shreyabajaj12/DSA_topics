public class prblm2_merge_sort {
    public static void printarray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);

        }
    }

    public static void merge(int[] arr, int l, int r, int mid) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i;
        int j;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[r - mid + j];
        }
        i = 0;
        j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
            while (i < n1) {
                arr[k++] = left[i++];

            }
            while (j < n2) {
                arr[k++] = right[j++];
            }
        }

    }

    public static void mergesort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);
        merge(arr, l, r, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 20, 2, 8, 11 };
        printarray(arr);
        mergesort(arr, 0, arr.length - 1);
        printarray(arr);
    }

}
