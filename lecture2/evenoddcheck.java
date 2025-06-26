import java.util.Scanner;

public class evenoddcheck {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
            return; // if we use return then it not go to line no. 13 if the input is even if input
                    // is odd then it not come to this loop it directly goes to line no 13 .
        }
        // else // if we don't use else then it print the next statement always which is
        // odd.
        {
            System.out.println("odd");
        }
    }

}