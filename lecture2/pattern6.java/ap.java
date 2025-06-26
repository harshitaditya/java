import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        int i = 1;
        while (i <= n) {

            int ans = ((3 * count) + 2);
            if (ans % 4 != 0) {
                System.out.println(ans);
                i++;

            }
            count++;
        }
    }

}
