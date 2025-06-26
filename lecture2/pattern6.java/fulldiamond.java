import java.util.Scanner;

public class fulldiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int space = 1;
            // int t = 3;
            while (space <= n - i) {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();

            i++;
        }
    }

}
