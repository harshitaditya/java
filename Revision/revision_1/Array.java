import java.util.Scanner;

public class Array {
    public static void intersection(int arr[], int arr1[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.print(arr[i] + " ");
                    arr1[j] = Integer.MIN_VALUE;
                    break;
                }

            }
        }
    }

    public static void swap(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < (n - 1); i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("Swapped Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrangearray(int arr[]) {
        int n = arr.length;
        int val = 1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (val % 2 == 1) {
                arr[start] = val;
                val++;
                start++;
            } else {
                arr[end] = val;
                val++;
                end--;
            }

        }
        System.out.println("Arranged array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static int largestarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static int sumarray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int size1 = s.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int lar = largestarray(arr);
        System.out.print("largest" + ":" + lar);
        System.out.println();
        int sum = sumarray(arr);
        System.out.print("sum" + ":" + sum);
        System.out.println();
        arrangearray(arr);
        swap(arr);
        intersection(arr, arr1);

    }

}
