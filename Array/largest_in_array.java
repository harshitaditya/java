import java.util.Scanner;

public class largest_in_array {
    public static int check(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] input() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;

    }

    public static void main(String[] args) {

        int arr[] = input();
        int output = check(arr);
        System.out.println(output);

    }

}
