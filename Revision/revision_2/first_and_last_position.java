import java.util.*;

public class first_and_last_position {
    public static int[] position(int arr[], int target) {
        // Approach:
        // position([1,2,5,5,6],5) find first and last index of target 5.
        int first = -1;// Initialize first to -1, indicating the target hasn't been found yet.
        int last = -1; // Initialize last to -1, indicating the target hasn't been found yet.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { // If the current element matches the target.
                if (first == -1) { // If this is the first occurrence of the target.
                    first = i; // Set first to the current index.
                }
                last = i; // Update last to the current index (it will update until the last occurrence).
            }
        }
        return new int[] { first + 1, last + 1 }; // it return{2,3} after adding one it become{3,4}

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
        System.out.println("Enter the target: ");
        int target = s.nextInt();
        int ans[] = position(arr, target); // in ans[]={3,4}
        System.out.println("The first and last index will be:");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
