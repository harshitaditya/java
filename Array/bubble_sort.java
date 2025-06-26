import java.util.Scanner;

public class bubble_sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void input() {

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
        System.out.println("Array after sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
