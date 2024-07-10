public class problem25_rec {
    static void replace(String s) {
        if (s.length() == 0) {
            return;
        }
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            System.out.print("3.14" + " ");
            replace(s.substring(2));
        } else {
            System.out.print(s.charAt(0) + " ");
            replace(s.substring(1));
        }
    }

    public static void main(String[] args) {
        replace("pippxxppiixipi");
    }
}
