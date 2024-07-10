import java.util.Stack;

public class problem32_stack {
   public static int[] greater(int[] arr) {
      int[] res = new int[arr.length];
      Stack<Integer> st = new Stack<>();
      res[arr.length - 1] = -1;
      st.push(arr[arr.length - 1]);
      for (int i = arr.length - 2; i >= 0; i--) {
         while (st.peek() < arr[i] && st.size() > 0) {
            st.pop();
         }
         if (st.size() == 0)
            res[i] = -1;
         else
            res[i] = st.peek();
         st.push(arr[i]);

      }
      return res;
   }

   public static void main(String[] args) {
      int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
      int[] res = greater(arr);
      for (int i : res) {
         System.out.print(i + " ");
      }

   }
}
