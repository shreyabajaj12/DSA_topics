public class problem24_recursion {
    static void reverse(String s) {
        if (s.length() == 0) {
            return;
        }

        reverse(s.substring(1));
        System.out.print(s.charAt(0) + " ");
    }

    public static void main(String[] args) {
        reverse("Shreya");
    }
}
