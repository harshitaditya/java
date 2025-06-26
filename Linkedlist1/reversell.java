import java.util.Scanner;

public class reversell {
    public static node<Integer> reverse(node<Integer> head) {
        // if (head == null || head.next == null) {// the complexity of the code in
        // O(n^2)
        // return head;
        // }
        // node<Integer> result = reverse(head.next);
        // node<Integer> temp = result;
        // while (temp.next != null) {
        // temp = temp.next;
        // }
        // temp.next = head;
        // head.next = null;
        // return result;
        if (head == null || head.next == null) {// the complexity of the code in O(n)
            return head;
        }
        node<Integer> reversetail = head.next;// ex= 1,2,3,4 the reverse tail of the value is 2 and 2 is the next of
                                              // head.
        node<Integer> ans = reverse(head.next);
        reversetail.next = head;// here 2 next will be 1 and 1 is head.
        head.next = null;

        return ans;

    }

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
        node<Integer> result = reverse(data);
        print(result);

    }

}
