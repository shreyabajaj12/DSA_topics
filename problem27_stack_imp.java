// import java.util.Stack;

public class problem27_stack_imp {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int n) {
            Node ll = new Node(n);
            ll.next = head;
            head = ll;
            size++;
        }

        int peek() {
            if (head == null) {
                System.out.println("empty");
                return -1;
            }
            return head.val;

        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void displayrec(Node head) {
            Node temp = head;
            if (temp == null)
                return;
            displayrec(temp.next);
            System.out.print(temp.val + " ");
            return;
        }

        void display() {
            displayrec(head);
        }

        void displayrev() {
            if (head == null)
                System.out.println("empty");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(9);
        st.push(92);
        st.push(95);
        st.push(99);
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        st.displayrev();
        st.display();
        // st.pop();
        // System.out.println(st.size);
        // System.out.println(st.peek());
    }
}
