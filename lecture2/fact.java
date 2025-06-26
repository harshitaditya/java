
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int div = 2;
        while (n > div) {
            if (n % div == 0) {
                System.out.print(div + "");
                // div++;
            }

            div++;

        }

    }
}
