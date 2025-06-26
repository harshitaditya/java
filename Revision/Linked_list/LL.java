public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add_first(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void add_last(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;

        }
        curNode.next = newnode;

    }

    public void print() {
        if (head == null) {
            System.out.println("The list is empty.");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void delete_first() {
        if (head == null) {
            System.out.println("The list is empty.");
        }
        head = head.next;
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("The list is empty.");
        }
        if (head.next == null) {
            head = null;

        }
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;

    }

    public int count() {
        int count = 0;
        if (head == null) {
            System.out.println("The list is empty.");
        }
        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;

    }

    public void reverseLL() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevnode = head;
        Node currnode = head.next;
        while (currnode != null) {
            Node nextnode = currnode.next;
            currnode.next = prevnode;
            prevnode = currnode;
            currnode = nextnode;

        }
        head.next = null;
        head = prevnode;

    }

    public Node reverseLL_recursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLL_recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String args[]) {
        LL obj = new LL();
        obj.add_first(2);
        obj.add_first(1);
        obj.add_last(3);
        obj.print();
        obj.reverseLL();
        // obj.head = obj.reverseLL_recursion(obj.head);
        obj.print();
        System.out.println("Total node is: " + obj.count());

    }

}
