import java.util.Scanner;

public class r1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("0");

        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }

    }
}
