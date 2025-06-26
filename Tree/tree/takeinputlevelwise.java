import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class takeinputlevelwise {
    public static treenode<Integer> inputlevelwise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rootnode: ");
        int rootnode = s.nextInt();
        queueusingLL<treenode<Integer>> pendingnode = new queueusingLL<>();
        treenode<Integer> root = new treenode<Integer>(rootnode);
        pendingnode.enqueue(root);
        while (!pendingnode.isEmpty()) {
            try {
                treenode<Integer> frontnode = pendingnode.dequeue();
                System.out.println("Enter the number of child of: " + frontnode.data);
                int numchild = s.nextInt();
                for (int i = 0; i < numchild; i++) {
                    System.out.println("Enter the" + (i + 1) + "child of : " + frontnode.data);
                    int child = s.nextInt();
                    treenode<Integer> childnode = new treenode<Integer>(child);
                    frontnode.children.add(childnode);
                    pendingnode.enqueue(childnode);
                }

            } catch (queueemptyexception e) {
                return null;
            }
        }
        return root;

    }

    public static void print(treenode<Integer> root) {

        // String s = root.data + ":";
        // for (int i = 0; i < root.children.size(); i++) {
        // s = s + root.children.get(i).data + ",";
        // }
        // System.out.println(s);
        // for (int i = 0; i < root.children.size(); i++) {
        // print(root.children.get(i));
        // }
        if (root == null) {
            return;
        }
        Queue<treenode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            treenode<Integer> front = queue.poll();
            if (front != null) {
                System.out.print(front.data);
                for (int i = 0; i < front.children.size(); i++) {
                    queue.add(front.children.get(i));
                }

            }

            else {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }

    }

    public static void main(String args[]) {
        treenode<Integer> root = inputlevelwise();
        print(root);

    }

}
