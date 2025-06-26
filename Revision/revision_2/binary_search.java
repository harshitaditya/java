import java.util.*;

public class binary_search {
    public static int binarysearch(int arr[], int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        // take input Array
        System.out.println("Enter the item of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the Target that you want to find the index: ");
        int target = s.nextInt();
        int index = binarysearch(arr, target);
        System.out.println("The index of the Target is: " + (index + 1));

    }

}
