import java.util.*;

public class r10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int num = n;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(num);
                j++;
            }
            System.out.println();
            i++;
            num--;
        }
    }

}
