import java.util.*;

public class problem28_stacks {
    static boolean isBalanced(String st) {
        Stack<Character> sta = new Stack<>();

        for (int i = 0; i < st.length(); i++) {
            if (sta.size() == 0 && st.charAt(i) == ')')
                return false;
            if (st.charAt(i) == '(' || st.charAt(i) == '{' || st.charAt(i) == '[') {
                sta.push('(');
            } else if (st.charAt(i) == ')') {
                sta.pop();
            }
        }
        if (sta.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(isBalanced(st));
    }
}
