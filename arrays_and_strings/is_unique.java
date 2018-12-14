
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "abcdefg";
        unique(str);
    }

    public static void unique(String s) {
        boolean[] un = new boolean[128];
        for (int i = 0; i < s.length(); ++i) {
            int x = s.charAt(i);
            if (un[x] == true) {
                System.out.print("Repeating Values");
                return;
            }

            un[x] = true;

        }

        System.out.print("The word in unique :)");
        return;
    }
}