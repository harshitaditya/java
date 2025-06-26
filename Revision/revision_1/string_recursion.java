import java.util.Scanner;

public class string_recursion {
    public static String removex(String s) {
        if (s.length() == 0) {
            return s;

        }
        String ans = "";
        if (s.charAt(0) != 'x') {
            ans = ans + s.charAt(0);

        }
        return ans + removex(s.substring(1));

    }

    public static void main(String args[]) {
        String str = "axbxcxdx";
        System.out.println(removex(str));

    }

}
