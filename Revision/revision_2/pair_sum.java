import java.util.*;

public class pair_sum {
    public static List<int[]> sum(List<Integer> arrlist, int target) {
        List<int[]> newlist = new ArrayList<>();
        for (int i = 0; i < arrlist.size(); i++) {
            for (int j = i + 1; j < arrlist.size(); j++) {
                if (arrlist.get(i) + arrlist.get(j) == target) {
                    newlist.add(new int[] { arrlist.get(i), arrlist.get(j) });

                }
            }
        }
        return newlist;

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<Integer> arrlist = new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int size = s.nextInt();
        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arrlist.add(s.nextInt());
        }
        System.out.println("Enter the Sum that you want from array list in pair: ");
        int target = s.nextInt();
        List<int[]> sumpair = sum(arrlist, target);

        // Each value is an array of two integers (a pair) from sumpair. value[0] and
        // value[1] are the two integers in that pair.
        // for (int[] value : sumpair) {
        // System.out.println("Pair: " + value[0] + " " + value[1]);
        // }

        // we can also do like this:
        for (int[] value : sumpair) {
            System.out.println("Pair: " + Arrays.toString(value));
        }

        // Why Use Arrays.toString()?

        // In Java, if you try to print an array directly using System.out.println(),
        // you won't get the actual contents of the array. Instead, you'll get a memory
        // reference or hash code, like [I@someHexValue.
        // For example, doing System.out.println(pair) will output something like
        // [I@6f94fa3e, which is not useful.

        // Human-Readable Output:
        // Arrays.toString(int[] array) converts the array into a string where the
        // elements are shown inside square brackets and separated by commas. For
        // example, if pair = {1, 6}, then Arrays.toString(pair) will output [1, 6].
        // This is much more readable and useful when you're trying to display the
        // contents of the array.

    }

}
