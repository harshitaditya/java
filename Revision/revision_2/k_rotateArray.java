import java.util.*;

public class k_rotateArray {
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void ktime_rotate(int arr[], int k) {
        // We have to reverse the array 3 times, ex:[1,2,3,4,5] -> [3,4,5,1,2]

        int n = arr.length;
        k = k % n;
        // k=3 and array length is 5 then k will be 3%5 then output will
        // be k=3, then we
        // have to rotate 3 times, if k=6 and arr.length is 5 then k=6%5 and k=1 and we
        // have to rotate 1 time. if we do not do this and user put the value of k
        // graeter than Array length then it Will show ArrayIndexOutOfBoundsException.

        // Approach:
        // First We reverse the array eg:[1,2,3,4,5] becomes [5,4,3,2,1]
        reverse(arr, 0, (arr.length - 1));
        // then again we reverse ktime for ex we reverse 3 times the it
        // become[3,4,5,2,1]
        reverse(arr, 0, k - 1);
        // now remaining we reverse remaining then it become[3,4,5,1,2]
        reverse(arr, k, (arr.length - 1));

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        // take input of array:
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();

        }
        // now we call the function:
        ktime_rotate(arr, 3);

        // now print the array:
        System.out.println("The Resultant Array are: ");
        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");
        // }
        for (int value : arr) { // for each loop. we can also write this.
            System.out.println(value);

        }

        // => arr is an array of integers, such as int[] arr = {1, 2, 3, 4, 5}.
        // =>The enhanced for loop iterates over each element in the array arr.
        // =>int value means that during each iteration, one element from the arr array
        // will be assigned to the variable value.
        // =>So, during the first iteration, value will be arr[0], during the second
        // iteration it will be arr[1], and so on, until the loop has gone through all
        // the elements of the array.

    }

}
