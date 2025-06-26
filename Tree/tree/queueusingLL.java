public class queueusingLL<t> {
    private node<t> front;
    private node<t> rear;
    private int size;

    public queueusingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    t front() throws queueemptyexception {
        if (size == 0) {
            throw new queueemptyexception();
        }
        return front.data;
    }

    queueusingLL<Integer> enqueue(t element) {
        node<t> newNode = new node<>(element);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        return null;

    }

    t dequeue() throws queueemptyexception {
        if (size == 0) {
            throw new queueemptyexception();
        }

        t temp = front.data;
        front = front.next;
        if (size == 1) {
            rear = null;
        }
        size--;

        return temp;
    }

}
