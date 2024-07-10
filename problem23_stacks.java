import java.util.Stack;

public class problem23_stacks {
    static void stack(Stack<Integer> st, int a) {
        if (st.size() == 0) {
            System.out.println(a);
            return;
        }
        int b = st.pop();
        stack(st, a);
        System.out.println(b);
        st.push(b);

    }

    static void stackrem(Stack<Integer> st, int i) {
        if (st.size() == i) {
            st.pop();
            return;
        }
        int b = st.pop();
        stackrem(st, i);
        st.push(b);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        stackrem(st, 5);
        while (st.size() != 0) {
            System.out.println(st.peek());
            st.pop();

            // stack(st, 0);
        }
    }
}
