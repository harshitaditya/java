import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = (n + 1) / 2;
        int count = num - 1;

        int i = 1;
        while (i <= num) {
            int space = n;
            while (space >= i) {
                System.out.print(" ");

                space--;

            }
            System.out.print("*");

            space = 1;

            while (space <= 2 * (i - 1)) {
                System.out.print(" ");

                space++;
            }
            if (i == 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
            System.out.println();
            i++;

        }
    }

}
