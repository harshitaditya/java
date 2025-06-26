import java.util.Scanner;

public class fibnacci {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int c;
        int i = 1;
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            i++;

        }
        System.out.println(a);
    }

}
