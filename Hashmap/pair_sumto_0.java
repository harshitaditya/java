import java.util.*;

public class pair_sumto_0 {
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
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int oppositekey = -key;
            if (map.containsKey(oppositekey) && map.get(arr[i]) > 0) {
                int times;
                if (key == oppositekey) {
                    times = map.get(key) * (map.get(key) - 1) / 2;
                    count += times;
                    map.put(key, 0);
                } else {
                    times = map.get(key) * map.get(oppositekey);
                    count += times;
                    map.put(key, 0);
                    map.put(oppositekey, 0);
                }
            }
        }
        System.out.println("The number of pair whose sum is 0: " + count);

    }

}
