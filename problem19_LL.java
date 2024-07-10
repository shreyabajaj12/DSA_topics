public class problem19_LL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    static Node Nthfrom(Node head, int idx) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        int res = count - idx + 1;
        temp = head;
        for (int i = 0; i < res - 1; i++) {
            temp = temp.next;
        }
        return temp;

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
        System.out.println(Nthfrom(a, 5).data);
    }
}
