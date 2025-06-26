public class check_sorted1 {
    public static boolean checksort(int arr[]) {
        if (arr.length <= 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int smallInput[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallInput[i - 1] = arr[i];
        }
        boolean smallans = checksort(smallInput);
        return smallans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 45, 0 };
        System.out.println(checksort(arr));

    }

}
