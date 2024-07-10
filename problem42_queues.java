import java.util.*;

public class problem42_queues {
    public static void main(String[] args) {
        int n = 3;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (q.size() > 2) {
            st.push(q.poll());
        }
        while (st.size() != 0) {
            q.add(st.pop());
        }
        System.out.println(q);

    }
}
