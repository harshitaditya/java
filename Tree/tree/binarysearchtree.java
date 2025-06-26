import java.util.*;

public class binarysearchtree {
    public static binarytreenode<Integer> takeinputlevelwise() {
        Scanner s = new Scanner(System.in);
        Queue<binarytreenode<Integer>> pendingnode = new LinkedList<>();
        System.out.println("Enter the data: ");
        int rootdata = s.nextInt();
        if (rootdata == -1) {
            return null;
        }
        binarytreenode<Integer> root = new binarytreenode<Integer>(rootdata);
        pendingnode.add(root);
        while (!pendingnode.isEmpty()) {
            binarytreenode<Integer> front = pendingnode.poll();
            System.out.println("Enter the leftchild of " + front.data);
            int leftchild = s.nextInt();
            if (leftchild != -1) {
                binarytreenode<Integer> child = new binarytreenode<Integer>(leftchild);
                front.left = child;
                pendingnode.add(child);
            }
            System.out.println("Enter the rightchild of " + front.data);
            int rightchild = s.nextInt();
            if (rightchild != -1) {
                binarytreenode<Integer> child = new binarytreenode<Integer>(rightchild);
                front.right = child;
                pendingnode.add(child);
            }

        }
        return root;

    }

    public static void print(binarytreenode<Integer> root) {
        if (root == null) {
            return;
        }
        String tobeprinted = root.data + " ";
        if (root.left != null) {
            tobeprinted += "L: " + root.left.data + " " + ",";
        }
        if (root.right != null) {
            tobeprinted += "R: " + root.right.data + " ";
        }
        System.out.println(tobeprinted);
        print(root.left);
        print(root.right);

    }

    public static Triplet<Boolean, Integer, Integer> isBST(binarytreenode<Integer> root) {
        if (root == null) {
            Triplet<Boolean, Integer, Integer> ans = new Triplet<>();
            ans.IsBsttree = true;
            ans.minimum = Integer.MAX_VALUE;
            ans.maximum = Integer.MIN_VALUE;
            return ans;
        }
        Triplet<Boolean, Integer, Integer> leftoutput = isBST(root.left);
        Triplet<Boolean, Integer, Integer> rightoutput = isBST(root.right);
        int min = Math.min(root.data, Math.min(leftoutput.minimum, rightoutput.minimum));
        int max = Math.max(root.data, Math.max(leftoutput.maximum, rightoutput.maximum));
        boolean checkBst = (root.data > leftoutput.maximum) && (root.data <= rightoutput.minimum)
                && leftoutput.IsBsttree && rightoutput.IsBsttree;
        Triplet<Boolean, Integer, Integer> ans = new Triplet<>();
        ans.IsBsttree = checkBst;
        ans.minimum = min;
        ans.maximum = max;
        return ans;

    }

    public static ArrayList<Integer> getpath(binarytreenode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if (root.data == data) {
            ans.add(root.data);
            return ans;
        }
        if (data < root.data) {
            ArrayList<Integer> leftoutput = getpath(root.left, data);
            if (leftoutput != null) {
                leftoutput.add(root.data);
                return leftoutput;
            }
        }
        if (data > root.data) {
            ArrayList<Integer> rightoutput = getpath(root.right, data);
            if (rightoutput != null) {
                rightoutput.add(root.data);
                return rightoutput;
            } else {
                return null;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        binarytreenode<Integer> root = takeinputlevelwise();
        System.out.println("The Binary tree is BST: " + isBST(root).IsBsttree);
        System.out.println(getpath(root, 2));

    }

}
