public class problem40_circular_queue {
    public static class cqueue {
        int[] arr = new int[5];
        int f = 0;
        int r = 0;
        int size = 0;

        void add(int val) {
            if (size == 0) {
                f = r = 0;
                arr[r] = val;
                size++;
            } else if (size == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            } else if (r < arr.length - 1) {
                arr[++r] = val;

                size++;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
                size++;
            }
        }

        int poll() {
            int temp = 0;
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else if (f == arr.length - 1) {
                temp = arr[arr.length - 1];
                f = 0;
                size--;
            } else {
                temp = arr[f];
                f = f + 1;
                size--;
            }
            return temp;
        }

        int peek() {
            return arr[f];
        }

        void display() {
            if (f < r) {
                int temp = f;
                while (temp <= r)
                    System.out.print(arr[temp] + " ");
                temp++;
            } else if (r < f) {
                while (f <= arr.length - 1) {
                    System.out.print(arr[f] + " ");
                    f++;
                }
                int temp = 0;
                while (temp <= r) {
                    System.out.print(arr[temp] + " ");
                    temp++;
                }
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        cqueue q = new cqueue();
        q.add(23);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size);
        // q.display();

    }
}
