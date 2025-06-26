import java.util.Scanner;

public class NcR2 {
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;

        }
        return ans;

    }

    public static int ncr(int n, int r) {
        int num = fact(n);
        int den1 = fact(r);
        int den2 = fact(n - r);
        int ans = num / (den1 * den2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int output = ncr(n, r);
        System.out.println(output);

    }

}
