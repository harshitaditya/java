import java.util.Scanner;

public class r7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int num = n;
        while (i <= n) {
            char count = (char) ('A' + num - 1);
            int j = 1;
            while (j <= i) {
                System.out.print((char) count);
                count++;
                j++;
            }
            System.out.println();
            i++;
            num--;
        }
    }

}
