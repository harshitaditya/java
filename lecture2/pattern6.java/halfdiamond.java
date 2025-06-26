import java.util.Scanner;

public class halfdiamond {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        System.out.println("*");
        int i = 1;

        while (i <= n) {
            System.out.print("*");
            int j = 1;

            while (j <= i)

            {
                System.out.print(j);
                j++;
            }

            j = i - 1;
            while (j >= 1) {
                System.out.print(j);

                j--;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        i = num - 1;
        while (i >= 1) {
            System.out.print("*");
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            j = i - 1;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.print("*");
            System.out.println();
            i--;

        }
        System.out.print("*");

    }
}
