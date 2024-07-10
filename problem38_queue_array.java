public class problem38_queue_array {
    public static class queueA {
        int f = -1;
        int r = -1;
        int[] arr = new int[100];
        int s = 0;

        public void add(int val) {
            f = 0;
            r = r + 1;
            arr[r] = val;
            s++;
        }

        public void display() {
            int temp = f;
            while (temp <= r) {
                System.out.print(arr[temp] + " ");
                temp++;
            }
            System.out.println();
        }

        public int poll() {
            if (s == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            f = f + 1;
            s--;

            return arr[f - 1];
        }

        public int size() {
            return s;
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(23);
        q.add(21);
        q.add(27);
        q.add(34);
        System.out.println(q.size());
        q.display();
        System.out.println(q.poll());
        q.display();
        // System.out.println(q.s);
        System.out.println(q.size());

    }
}
