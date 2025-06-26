// here we use Stack in built function.

import java.util.Stack;

public class Stack_inbuilt {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = { 15, 10, 5 };
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }
        System.out.println(stack.pop() + stack.size());

    }

}
