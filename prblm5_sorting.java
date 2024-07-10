public class prblm5_sorting {
    public static void sortarray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void trying(int[] arr) {
        int x = -1;
        int y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 8, 3 };
        trying(arr);
        sortarray(arr);

    }
}
