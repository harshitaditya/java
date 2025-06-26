public class power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return pow(x, n - 1) * x;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = pow(x, n);
        System.out.println(ans);

    }

}
