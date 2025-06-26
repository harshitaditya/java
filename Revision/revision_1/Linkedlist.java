import java.util.LinkedList;
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("is");
        list.addFirst("Aditya");
        list.addLast("a");
        list.add("Good");
        list.add("Boy");// list.addLast and list.add are work same they both add in last.

        System.out.println(list);
        // Another way to print LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");

        }
        System.out.println("null");
        // Remove LinkedList node
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }

}
