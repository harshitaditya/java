import java.util.*;

public class sorting {
    public static void selectionsort(int arr[]) {
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

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
