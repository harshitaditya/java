
public class stackuse_array {
    public static void main(String args[]) throws stackfullexception {
        stack_usingarray stack = new stack_usingarray();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        while (!stack.isempty()) {
            try {
                System.out.println(stack.pop());
            } catch (stackemptyexception e) {
                // here never reach

            }

        }
    }

}
