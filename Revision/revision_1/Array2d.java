import java.util.Scanner;

public class Array2d {
    public static void sumofrow(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum: " + sum + " ");
            sum = 0;
        }

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int row = s.nextInt();
        System.out.println("Enter the no. of columns: ");
        int column = s.nextInt();
        int arr[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element at " + i + " row and " + j + " column");
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sumofrow(arr);

    }

}
