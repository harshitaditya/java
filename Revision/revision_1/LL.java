public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void firstadd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void lastadd(String data) {
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
        LL list = new LL();
        list.firstadd("Aditya");
        list.lastadd("Kumar");
        list.lastadd("gupta");
        list.printlist();
        list.reverse();

        list.printlist();

    }

}
