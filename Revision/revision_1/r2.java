import java.util.*;

public class r2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }

            i++;

        }
        System.out.println(sum);

    }

}
