import java.util.Scanner;

public class tset {
    public static void main(String[] args) {
        Scanner shub = new Scanner(System.in);
        String s = shub.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' || (i < s.length() - 1 && s.charAt(i + 1) == '#')) {
                continue;
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
