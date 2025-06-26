import java.util.*;

public class largest_and_smallest_sum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The number of chemiclal: ");
        int chemicalcount = s.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        System.out.println("Enter the Value of chemical: ");
        for (int i = 0; i < chemicalcount; i++) {
            int chemical = s.nextInt();
            if (chemical > largest) { // for ex:the values are:10 2 30 4 -6 -7 in first iteration it will comapre 10
                                      // and largest which is Integer.Minvalue which is smaller than 10 then largest
                                      // will be 10.
                                      // and second largest will be largest which is Integer.Minvalue. and so on.
                secondlargest = largest;
                largest = chemical;
            } else if (chemical > secondlargest) {
                secondlargest = chemical;
            }

            if (chemical < smallest) {
                secondsmallest = smallest;
                smallest = chemical;
            } else if (chemical < secondsmallest) {
                secondsmallest = chemical;
            }
        }
        int largestsum = largest + secondlargest;
        int smallestsum = smallest + secondsmallest;
        System.out.println("Largest: " + largestsum);
        System.out.println("Smallest: " + smallestsum);
        System.out.println(secondlargest);

    }

}
