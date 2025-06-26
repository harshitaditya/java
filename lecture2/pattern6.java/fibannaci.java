import java.util.Scanner;

public class fibannaci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num1 = 1;
        int num2 = 1;

        int i = 1;
        while (i < n) {

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            i++;

        }
        System.out.println(num1);

    }

}
