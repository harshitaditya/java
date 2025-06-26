import java.util.Scanner;

public class pattern6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int count = n;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(count);
                j++;
            }
            System.out.println();
            count--;
            i++;
        }

    }

}
