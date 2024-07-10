public class problem26_rec_towerOfHanoi {
    static void hanoi(int n, char src, char des, char help) {
        if (n == 0)
            return;
        hanoi(n - 1, src, help, des);
        System.out.println("move from " + src + " to " + des);
        hanoi(n - 1, help, des, src);
    }

    public static void main(String[] args) {
        hanoi(2, 'A', 'C', 'B');
    }
}
