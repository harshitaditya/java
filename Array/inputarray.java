import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <= (size - 1); i++) {
            arr[i] = s.nextInt();

        }
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}