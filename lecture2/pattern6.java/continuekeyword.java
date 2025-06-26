public class continuekeyword {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++; // in while loop we have to use iteration to skip i=5 ande then it continue to
                     // 10.
                continue; // after this continue it directly goes to while condition.or exit the loop.
            }
            System.out.println(i);
            i++;
        }
    }

}
