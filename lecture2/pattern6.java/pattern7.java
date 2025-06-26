import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int num = (n + 1) / 2;
        int count = num - 1;
        int i = 1;
        while (i <= num) {
            int space = 1;
            while (space <= num - i) {
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
        // n2 = n1 - 1;
        count = 1;
        i = 1;
        while (i <= (num - 1)) {

            int space = 1;
            while (space <= count) {
                System.out.print(" ");

                space++;
            }
            count++;
            int j = 1;
            while (j <= (2 * (num - i)) - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;

        }

    }
}
