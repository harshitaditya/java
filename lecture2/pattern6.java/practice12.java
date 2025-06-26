import java.util.Scanner;

public class practice12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i = n;
        while (i >= 1) {
            int space = 1;
            while (space <= i - 1)

            {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
