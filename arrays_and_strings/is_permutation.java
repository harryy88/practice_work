
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(is_permutation("dofg", "god"));

    }

    public static boolean is_permutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] l1 = s1.toCharArray();
        char[] l2 = s2.toCharArray();

        Arrays.sort(l1);
        Arrays.sort(l2);

        return Arrays.equals(l1, l2);
    }
}