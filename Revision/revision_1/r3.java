import java.util.*;

public class r3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int s1 = 0;
        int s2 = 0;
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            if (r % 2 == 0) {
                s1 += r;

            } else {
                s2 += r;

            }

        }
        System.out.println(s1 + " " + s2);
    }

}
