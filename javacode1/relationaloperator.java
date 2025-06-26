import java.util.Scanner;

public class relationaloperator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        boolean iseq = (i == j);
        boolean neq = (i != j);
        boolean gre = (i > j);
        boolean less = (i < j);
        boolean greeq = (i >= j);
        boolean lesseq = (i <= j);
        System.out.println(iseq);
        System.out.println(neq);
        System.out.println(gre);
        System.out.println(less);
        System.out.println(greeq);
        System.out.println(lesseq);
    }

}
