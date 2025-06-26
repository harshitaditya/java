import java.util.Scanner;

public class binarysearch {
    public static int search(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int x = s.nextInt();
        int output = search(arr, x);
        System.out.println("your output is: " + output);

    }

}
