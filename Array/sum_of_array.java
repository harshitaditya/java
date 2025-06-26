import java.util.Scanner;

public class sum_of_array {
    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;

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
        int output = sum(arr);

        System.out.println(output);

    }

}
