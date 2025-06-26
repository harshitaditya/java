public class stackuse_doublelength {
    public static void main(String args[]) throws stackfullexception {
        doublestack stack = new doublestack(3);
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
