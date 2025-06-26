import java.util.Scanner;

public class oddpattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print("*");
            int value = ((2 * i) - 1);
            int j = n;

            while (j >= i)

            {

                System.out.print(value);
                value = value + 2;
                j--;
            }
            j = 1;
            int p = 1;
            while (j <= i - 1) {

                System.out.print(p);
                p = p + 2;
                j++;
            }
            System.out.print("*");

            System.out.println();
            i++;
        }
    }
}
