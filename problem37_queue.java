import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class problem37_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer>q1=new ArrayDeque<>() ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        Queue<Integer> helper = new LinkedList<Integer>();
        while (q.size() != 0) {
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        System.out.println();
        System.out.println(helper);
        // q.remove();
        // System.out.println(q);

    }
}
