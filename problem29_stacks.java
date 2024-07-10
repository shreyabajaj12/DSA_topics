import java.util.*;

public class problem29_stacks {
    static int valid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && st.size() == 0) {
                count++;
            } else {
                if (s.charAt(i) == '(') {
                    st.push(s.charAt(i));
                } else {
                    st.pop();
                }
            }
        }
        if (st.size() != 0) {
            int r = st.size();
            count += r;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(valid(s));
    }
}
