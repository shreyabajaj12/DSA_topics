public class problem20_LL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    static Node solution(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(10);
        Node c = new Node(1);
        Node d = new Node(200);
        Node e = new Node(400);
        Node f = new Node(500);
        a.next = b;
        c.next = d;
        d.next = e;
        e.next = f;
        b.next = c;
        System.out.println(solution(a, 6).data);
    }
}
