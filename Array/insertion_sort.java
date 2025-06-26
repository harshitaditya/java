import java.util.*;

public class insertion_sort {
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp; // it means that arr of index j assign the value of temp. it become j because it
                               // decrease by -1 after j--.
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
