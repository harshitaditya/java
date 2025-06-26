import java.util.*;

public class maximum_frequency_number {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        int maxkey = Integer.MIN_VALUE;
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > maxvalue) {
                maxvalue = map.get(arr[i]);
                maxkey = arr[i];
            }
        }
        System.out.println("The Maximum Frequency Number is:" + maxkey);

    }

}
