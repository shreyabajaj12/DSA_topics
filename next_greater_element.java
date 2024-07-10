import java.util.Stack;

public class next_greater_element {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        // System.out.println(st.peek());
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() != 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
