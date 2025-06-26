public class queue_using_array {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public queue_using_array() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public queue_using_array(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;

    }

    public int size() {
        return size;
    }

    public boolean isempty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int front() throws Exception {
        if (size == 0) {
            Exception e = new emptyqueueexception();
            throw e;
        }
        return data[front];
    }

    public void enqueue(int element) throws fullqueueexception {
        if (size == data.length) {
            throw new fullqueueexception();
        }
        if (size == 0) {
            front = 0;
        }
        size++;
        rear++;
        if (rear == data.length) {
            rear = 0;
        }
        data[rear] = element;
    }

    public int dequeue() throws emptyqueueexception {
        if (size == 0) {
            throw new emptyqueueexception();
        }

        int temp = data[front];
        front++;
        size--;
        if (front == data.length) {
            front = 0;
        }
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

}
