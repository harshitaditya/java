import java.util.Scanner;

public class revers_head_tail {
    public static DoubleNode reverse(node<Integer> head) {
        if (head == null || head.next == null) {
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallans = reverse(head.next);
        smallans.tail.next = head;
        head.next = null;
        DoubleNode ans = new DoubleNode();
        ans.head = smallans.head;
        ans.tail = head;
        return ans;
    }

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
            node<Integer> result = revers_head_tail(data);
            print(result);

        }

    }


   