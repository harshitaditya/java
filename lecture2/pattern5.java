import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int num = n;
        while (i <= n) {
            int j = 1;
            char count = (char) ('A' + num - 1);
            while (j <= i) {
                System.out.print((char) (count));
                j++;
                count++;

            }
            System.out.println();
            num--;
            i++;
        }
    }

}
