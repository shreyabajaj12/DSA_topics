import java.util.*;

public class problem41_dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(23);
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.add(4);
        System.out.println(dq);
    }
}
