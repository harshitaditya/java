import java.util.*;

public class takeinputlevelwise1 {
    // take input of tree levelwise
    public static treenode<Integer> takeinput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root Node: ");
        int rootnode = s.nextInt();
        Queue<treenode<Integer>> pendingnode = new LinkedList<>();
        treenode<Integer> root = new treenode<Integer>(rootnode);
        pendingnode.add(root);
        while (!pendingnode.isEmpty()) {
            treenode<Integer> frontnode = pendingnode.poll();
            System.out.println("Enter the children of " + frontnode.data);
            int childcount = s.nextInt();
            for (int i = 0; i < childcount; i++) {
                System.out.println("Enter the " + (i + 1) + " child of " + frontnode.data);
                int child = s.nextInt();
                treenode<Integer> childnode = new treenode<Integer>(child);
                frontnode.children.add(childnode);
                pendingnode.add(childnode);

            }
        }
        return root;

    }
    // print using queue

    // public static void print(treenode<Integer> root) {
    // if (root == null) {
    // return;
    // }
    // Queue<treenode<Integer>> queue = new LinkedList<>();
    // queue.add(root);
    // queue.add(null);
    // while (!queue.isEmpty()) {
    // treenode<Integer> front = queue.poll();
    // if (front != null) {
    // System.out.print(front.data + " ");
    // for (int i = 0; i < front.children.size(); i++) {
    // queue.add(front.children.get(i));

    // }

    // } else {
    // System.out.println();
    // if (!queue.isEmpty()) {
    // queue.add(null); // If we encounter a null node in the queue, it means that
    // the previous level
    // // has been fully processed.
    // }
    // }

    // }

    // }

    // print using recursion
    public static void print(treenode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";

        }
        System.out.println(s);

        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }

    }

    public static int countnode(treenode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childnode = countnode(root.children.get(i));
            count = count + childnode;
        }
        return count + 1;

    }

    public static void nodeAtdepthk(treenode<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data + " ");
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            nodeAtdepthk(root.children.get(i), k - 1);
        }

    }

    public static int countleaf(treenode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.children.size() == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childleaf = countleaf(root.children.get(i));
            count += childleaf;

        }
        return count;
    }

    public static void main(String args[]) {
        treenode<Integer> root = takeinput();
        print(root);
        System.out.println("The number of Nodes in a tree: " + countnode(root));
        nodeAtdepthk(root, 2);
        System.out.println("The number of leaf nodes: " + countleaf(root));

    }

}
