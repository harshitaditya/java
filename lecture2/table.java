import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            if (r % 2 == 0) {
                sum1 = sum1 + r;

            } else {
                sum2 = sum2 + r;
            }

        }
        System.out.println(sum1 + " " + sum2);
    }
}
