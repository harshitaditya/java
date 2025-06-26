import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem;
        int ans = 0;
        int pv = 1;

        while (n != 0) {
            rem = n % 2;
            ans = ans + rem * pv;
            pv = pv * 10;

            n /= 2;

        }
        System.out.println(ans);
    }
}
