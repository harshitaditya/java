import java.util.*;

public class factor {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int div = 2;
        while (n > div) {
            if (n % div == 0) {
                System.out.println(div + " ");
            }
            div++;
        }

    }

}
