public class prblm7_sorting {
    static void printarraay(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void sort(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;

        }
        int k = 0;
        while (count0 > 0) {
            arr[k++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[k++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[k++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 0 };
        sort(arr);
        printarraay(arr);
    }
}
