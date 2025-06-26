import java.util.Scanner;

public class pattern1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num1 = (n + 1) / 2;
        int num2 = num1 - 1;
        int i = 1;
        while (i <= num1) {
            int space = 1;
            while (space <= num1 - i) {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= (2 * i) - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        num2 = 1;
        i = 1;
        while (i <= num1 - 1) {
            int space = 1;
            while (space <= num2) {
                System.out.print(" ");
                space++;
            }

            num2++;
            int j = 1;
            while (j <= 2 * (num1 - i) - 1) {
                System.out.print("*");
                j++;

            }

            System.out.println();
            i++;
        }
    }
}
