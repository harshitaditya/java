import java.util.*;

public class pattern5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == num || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
    }

}
