public class use_queue {
    public static void main(String args[]) throws Exception {
        queue_using_array queue = new queue_using_array();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        // while (!queue.isempty()) {
        // System.out.println(queue.dequeue());
        // }
        System.out.println(queue.front());
        System.out.println(queue.size());
    }

}
