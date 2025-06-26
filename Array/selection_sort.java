import java.util.Scanner;

public class selection_sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                arr[minindex] = arr[i];
                arr[i] = min;
            }

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr);
        System.out.println("Your sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
