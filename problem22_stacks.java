import java.util.Stack;

public class problem22_stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(34);
        st.push(23);
        st.push(12);
        st.push(36);
        Stack<Integer> st1 = new Stack<>();

        // while (st.size() > 0) {
        // st1.push(st.pop());

        // }
        System.out.println(st1);
        System.out.println(st);
    }
}
