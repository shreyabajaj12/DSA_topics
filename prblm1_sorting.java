public class prblm1_sorting {
    public static void sort0(String[] arr) {
        int n = arr.length;
        // for (int i = 0; i < arr.length; i++) {
        // boolean flag = true;
        // for (int j = 0; j < n - i - 1; j++) {
        // if (arr[j] == 0 && arr[j + 1] != 0) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // flag = false;
        // }

        // }
        // if (flag == true)
        // return;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void main(String[] args) {
        String[] arr = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        sort0(arr);
        for (String a : arr) {
            System.out.println(a);

        }

    }
}