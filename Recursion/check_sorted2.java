
// we do this code withhout taking any smallinput array to save space.
import java.util.*;

public class check_sorted2 {
    public static boolean checksort(int arr[], int startIndex) {
        if (startIndex >= arr.length - 1)// it means that we traverse all the array and we reached at last if we reached
                                         // at last it means that the array is sorted.
        {
            return true;

        }
        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }
        boolean ans = checksort(arr, startIndex + 1);
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size_array = s.nextInt();
        System.out.println("Enter the Elements of array: ");
        int arr[] = new int[size_array];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(checksort(arr, 0));// we use 0 here because index is start from 0.

    }

}
