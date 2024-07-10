import java.util.*;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int put = sc.nextInt();
        for (int i = 0; i < put; i++) {
            int no = sc.nextInt();
            int first = no % 10;
            no /= 10;
            int second = no % 10;
            no /= 10;
            int third = no % 10;
            if ((first + second + third >= 2)) {
                count++;
            }

        }
        System.out.println(count);
        Math.random();
    }
}
