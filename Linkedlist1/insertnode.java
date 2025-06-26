import java.util.Scanner;

public class insertnode {
    public static node<Integer> takeInput() {
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

    public static node<Integer> insert(node<Integer> head, int data, int pos) {
        node<Integer> newnode = new node<Integer>(data);
        if (pos == 0) {
            newnode.next = head;
            head = newnode;
            return newnode;
        }
        node<Integer> temp = head;
        int i = 0;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    public static void main(String args[]) {
        node<Integer> head = takeInput();
        head = insert(head, 80, 0);
        print(head);

    }

}
