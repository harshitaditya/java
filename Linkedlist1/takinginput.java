import java.util.Scanner;

public class takinginput {
    public static node<Integer> takeinput() {
        node<Integer> head = null;
        node<Integer> tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newnode = new node<Integer>(data);

            if (head == null) {
                head = newnode;
                tail = newnode;

            } else {
                tail.next = newnode;
                tail = newnode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        node<Integer> data = takeinput();
        print(data);

    }

}
