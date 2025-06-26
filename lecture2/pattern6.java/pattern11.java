import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == (m - 1) / 2 || j - i == (m - 1) / 2 || i - j == (m - 1) / 2 || i + j == m + 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
 