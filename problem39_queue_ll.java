public class problem39_queue_ll {
    public static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (head == null && tail == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int poll() {
            if (head == null || tail == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int temp = head.val;
            head = head.next;
            size--;
            return temp;
        }

        public void peek() {
            if (head == null || tail == null) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println(head.val);
        }

        public int size() {
            return size;
        }

        public void display() {
            if (head == null || tail == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queueL q = new queueL();
        q.add(12);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.peek();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.display();
        q.peek();
        q.poll();
    }
}
