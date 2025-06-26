import java.util.*;

public class function1 {
    public static boolean checkprime(int n) {
        int d = 2;
        while (d < n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    public static void printprime(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isIprime = checkprime(i);
            if (isIprime) {
                System.out.println(i);

            }

        }
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;

        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to print prime: ");
        int x = s.nextInt();
        printprime(x);
        System.out.println("Enter n: ");
        int n = s.nextInt();
        System.out.println("Enter r: ");
        int r = s.nextInt();
        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n - r);
        int ans = num / (den1 * den2);
        System.out.println(ans);

    }

}
