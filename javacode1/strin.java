import java.util.Scanner;

public class strin {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // String str = s.nextLine();//If we use nextLine then the output is not break
        // after the space.
        String str = s.next();// If we only use next then the output will break after the space.
        System.out.println(str);
    }

}
