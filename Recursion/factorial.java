import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = fact(n - 1);
        return n * ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int n = s.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);

    }

}
