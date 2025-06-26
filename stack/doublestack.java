public class doublestack {
    private int data[];
    private int top;

    public doublestack() {
        data = new int[10];
        top = -1;

    }

    public doublestack(int capacity) {
        data = new int[capacity];
        top = -1;

    }

    public boolean isempty() {
        // if (top == -1) {
        // return true;
        // } else {
        // return false;
        // }
        return (top == -1);
    }

    public int size() {
        return top + 1;

    }

    public int top() throws stackemptyexception {
        if (size() == 0) {
            stackemptyexception e = new stackemptyexception();

            throw e;

        }
        return data[top];
    }

    public void push(int elem) throws stackfullexception {
        if (size() == data.length) {
            doublelengthof_stack();

        }

        top++;
        data[top] = elem;
    }

    private void doublelengthof_stack() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i <= top; i++) {
            data[i] = temp[i];
        }
    }

    public int pop() throws stackemptyexception {
        if (size() == 0) {
            stackemptyexception e = new stackemptyexception();

            throw e;

        }
        int temp = data[top];
        top--;
        return temp;
    }

}
