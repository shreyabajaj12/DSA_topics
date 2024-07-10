public class problem18_Linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void addAtHead(int no) {
            Node temp = new Node(no);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void addAtEnd(int no) {
            Node temp = new Node(no);
            if (head == null) {
                addAtHead(no);
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void addAt(int idx, int no) {
            Node t = new Node(no);
            Node temp = head;
            if (idx == 0) {
                addAtHead(no);
                return;
            } else if (idx == size) {
                addAtEnd(no);
                return;
            } else {
                for (int i = 1; i < idx - 1; i++) {
                    temp = temp.next;

                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }

        void getAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
            if (idx == size - 1) {
                temp = tail;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtHead(89);
        ll.display();
        ll.addAtEnd(23);
        ll.display();
        ll.addAt(2, 34);
        ll.display();
        ll.addAt(3, 12);
        ll.display();
        ll.deleteAt(2);
        ll.display();
        ll.getAt(1);
        System.out.println(ll.size);
    }
}
