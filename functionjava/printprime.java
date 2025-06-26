import java.util.Scanner;

public class printprime {
    public static boolean isprime(int n) {
        int d = 2;
        while (d < n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    public static void prime(int n) { // in void we cannot collect the result.
        for (int i = 2; i <= n; i++) {
            boolean isprime = isprime(i);
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        prime(n);

    }

}
