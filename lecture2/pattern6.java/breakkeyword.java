
public class breakkeyword {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
                if (j > i) {
                    break; // here we use break statement that,s why it's break and it's shape become semi
                           // triangle.

                }
            }
            System.out.println();
            i++;
        }
    }
}
