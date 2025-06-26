//here we make different function of push,pop,size(),top() function.
public class stack_usingarray {
    private int data[];
    private int top;

    public stack_usingarray() {
        data = new int[10];
        top = -1;

    }

    public stack_usingarray(int capacity) {
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
            stackfullexception e = new stackfullexception();

            throw e;

        }

        top++;
        data[top] = elem;
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
