import java.util.*;

public class fibonacci_number {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci series: ");
        int n = s.nextInt();
        System.out.println(fib(n));

    }

}
