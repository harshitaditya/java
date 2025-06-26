public class RevisionLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;

    }

    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println("null");
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        if (head.next == null) {
            System.out.println("LinkedList have only one Node");
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

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;

        }
        return count;
    }

    public int getsum() {
        int sum = 0;
        Node temp = head;
        if (temp == null) {
            return 0;
        }
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;

        }
        return sum;

    }

    public void rrlist() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public static void main(String args[]) {
        RevisionLL list = new RevisionLL();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);

        list.print();
        System.out.println(list.size());
        System.out.println(list.getsum());
        list.rrlist();
        list.print();

    }

}
