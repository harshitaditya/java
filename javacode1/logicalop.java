import java.util.Scanner;

public class logicalop {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean isAlargest = (a >= b) && (a >= c);
        System.out.println(isAlargest);
        boolean isAlarger = (a >= b) || (a >= c);
        System.out.println(isAlarger);
    }

}
