import java.util.Scanner;

public class recursion {
    public static int multiplication(int x, int n) {
        if (n == 0) {
            return 0;

        }
        return multiplication(x, n - 1) + x;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return power(x, n - 1) * x;
    }

    public static int naturalno(int n) {
        if (n == 0) {
            return 0;
        }

        return naturalno(n - 1) + n;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int smallans = factorial(n - 1);
        return n * smallans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = factorial(n);
        System.out.println("factorial: " + ans + " ");
        int ans1 = naturalno(n);
        System.out.println("sum of natural number: " + ans1 + " ");
        System.out.println("Enter the no. to get power: ");
        int x = s.nextInt();
        int ans2 = power(x, n);
        System.out.println("power: " + ans2);
        int ans3 = multiplication(x, n);
        System.out.println("multiplication: " + ans3 + " ");

    }

}
