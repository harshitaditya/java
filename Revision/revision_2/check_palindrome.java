import java.util.*;

public class check_palindrome {
    public static boolean checkpalindrome(String word) {

        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = s.nextLine();
        String cleaninput = input.replaceAll("\\s+", "").toLowerCase();
        // "input.replaceAll" remove the all space,\\s is helpto remove space,tabs,line
        // break and \\s+ helps to remove multiple whitespace and
        // ".toLowerCase" convert into lowercase,we convert intolower case
        // because the palindrome word have first Capital
        // letter and other samll letter then it consider as
        // non palindrome.
        System.out.println(cleaninput);
        if (checkpalindrome(cleaninput)) {
            System.out.println(input + " is Palindrome.");
        } else {
            System.out.println(input + " is not Palindrome.");
        }
    }

}

// String is immutable. for more study from chatgpt
