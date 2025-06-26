import java.util.LinkedList;

public class linkedlist_II {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addFirst(0);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
