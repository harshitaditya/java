public class sum_of_natural_no {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int ans = sum(n - 1);
        return n + ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int add = sum(n);
        System.out.println(add);

    }

}
