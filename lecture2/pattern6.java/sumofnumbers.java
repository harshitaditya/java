import java.util.Scanner;

public class sumofnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {

            int currcol = 1;
            sum = sum + i;
            while (currcol <= i) {
                System.out.print(currcol);
                if (currcol == i) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                currcol++;
            }

            System.out.print(sum);

            i++;
        }
    }
}
