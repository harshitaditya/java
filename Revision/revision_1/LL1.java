public class LL1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public void firstadd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void lastadd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printlist() {
        Node currNode;
        currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This linked list is empty");
            return;
        }

        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("This linked list is empty");
            return;
        }

        if (head.next == null) {
            System.out.println("This Linked List have only one node");
            return;

        }
        Node secondlastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondlastNode = secondlastNode.next;
            lastNode = lastNode.next;
        }
        secondlastNode.next = null;
    }

    public int getsize() {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node currnode = head.next;
        while (currnode != null) {
            Node temp = currnode.next;
            currnode.next = prev;
            prev = currnode;
            currnode = temp;

        }
        head.next = null;
        head = prev;
    }

    public static void main(String args[]) {
        LL1 list = new LL1();
        list.lastadd(20);
        list.lastadd(30);
        list.lastadd(40);
        list.lastadd(50);
        list.printlist();
        list.deleteFirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        // System.out.println(list.getsize());
        list.reverse();
        list.printlist();

    }

}
