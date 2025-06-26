import java.util.*;

public class merge_sort {
    public static void sort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid); // run recursively
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    public static void merge(int arr[], int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        // for copy remaining array if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr, 0, arr.length - 1);

        System.out.println("The resultant array will be: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
