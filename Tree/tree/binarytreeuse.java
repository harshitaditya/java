import java.util.*;

public class binarytreeuse {
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

    public static binarytreenode<Integer> takeinput(Scanner s) {
        System.out.println("Enter the next data: ");
        int rootdata = s.nextInt();
        if (rootdata == -1) {
            return null;
        }
        binarytreenode<Integer> root = new binarytreenode<Integer>(rootdata);
        root.left = takeinput(s);
        root.right = takeinput(s);
        return root;

    }

    public static int countnode(binarytreenode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftnode = countnode(root.left);
        int rightnode = countnode(root.right);
        return leftnode + rightnode + 1;

    }

    public static int greatestamongall(binarytreenode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftnode = greatestamongall(root.left);
        int rightnode = greatestamongall(root.right);
        return Math.max(root.data, Math.max(leftnode, rightnode));
    }

    public static int countleaf(binarytreenode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return 1;
        }
        int leftnode = countleaf(root.left);
        int rightnode = countleaf(root.right);
        return leftnode + rightnode;
    }

    public static void valueatk(binarytreenode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        valueatk(root.left, k - 1);
        valueatk(root.right, k - 1);

    }

    public static binarytreenode<Integer> removeleafnodes(binarytreenode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;

        }
        root.left = removeleafnodes(root.left); // here we store the value removeleafnodes(root.left) in root.left
        root.right = removeleafnodes(root.right);
        return root;
    }

    public static int heightoftree(binarytreenode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftchild = heightoftree(root.left);
        int rightchild = heightoftree(root.right);
        if (leftchild > rightchild) {
            return leftchild + 1;
        }
        return rightchild + 1;

    }

    // Time complexity is O(n).
    public static boolean balancetree(binarytreenode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftchild = heightoftree(root.left);
        int rightchild = heightoftree(root.right);
        if (Math.abs(leftchild - rightchild) > 1) {
            return false;
        }
        boolean isleftbalanced = balancetree(root.left);
        boolean isrightbalanced = balancetree(root.right);
        return isleftbalanced && isrightbalanced; // return true if the both condition is true

    }

    public static Binarytreereturn isbalacebetter(binarytreenode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isbal = true;
            Binarytreereturn ans = new Binarytreereturn();
            ans.height = height;
            ans.isBalanced = isbal;
            return ans;

        }
        Binarytreereturn leftoutput = isbalacebetter(root.left);
        Binarytreereturn rightoutput = isbalacebetter(root.right);
        boolean isbal = true;
        int height = 1 + Math.max(leftoutput.height, rightoutput.height);
        if (Math.abs(leftoutput.height - rightoutput.height) > 1) {
            isbal = false;

        }
        if (!leftoutput.isBalanced || !rightoutput.isBalanced) {
            isbal = false;
        }
        Binarytreereturn ans = new Binarytreereturn();
        ans.height = height;
        ans.isBalanced = isbal;
        return ans;

    }

    // Time complexity is O(nlogn)
    public static int diameteroftree(binarytreenode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftroot = heightoftree(root.left);
        int rightroot = heightoftree(root.right);
        int option1 = leftroot + rightroot;
        int option2 = diameteroftree(root.left);
        int option3 = diameteroftree(root.right);
        return Math.max(option1, Math.max(option2, option3));

    }

    // height and diameter using pair.
    // Time complexity is O(n).
    public static Pair<Integer, Integer> heightdiameters(binarytreenode<Integer> root) {
        if (root == null) {
            Pair<Integer, Integer> ans = new Pair<>();
            ans.height = 0;
            ans.diameter = 0;
            return ans;
        }
        Pair<Integer, Integer> leftoutput = heightdiameters(root.left);
        Pair<Integer, Integer> rightoutput = heightdiameters(root.right);
        int heightoftree = 1 + Math.max(leftoutput.height, rightoutput.height);
        int option1 = leftoutput.diameter;
        int option2 = rightoutput.diameter;
        int option3 = leftoutput.height + rightoutput.height;
        int diameteroftree = Math.max(option1, Math.max(option2, option3));
        Pair<Integer, Integer> ans = new Pair<>();
        ans.height = heightoftree;
        ans.diameter = diameteroftree;
        return ans;

    }

    public static void inordertraversal(binarytreenode<Integer> root) {
        if (root == null) {
            return;
        }
        inordertraversal(root.left);
        System.out.print(root.data + " ");
        inordertraversal(root.right);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        binarytreenode<Integer> root = takeinputlevelwise();
        print(root);
        s.close();
        System.out.println("The total number of nodes: " + countnode(root));
        System.out.println("The greatest node: " + greatestamongall(root));
        // System.out.println("The total number of leaf nodes: " + countleaf(root));
        // removeleafnodes(root);
        // print(root);
        // System.out.println("The height of the tree is: " + heightoftree(root));
        // System.out.println("Balance Tree: " + balancetree(root));

        System.out.println("Balance Tree: " + isbalacebetter(root).isBalanced);
        System.out.println("The height of the tree is: " + isbalacebetter(root).height);
        System.out.println("The diameter of tree: " + heightdiameters(root).diameter);
        // System.out.println("The Inorder Traversal will be: ");
        // inordertraversal(root);

        // binarytreenode<Integer> root = new binarytreenode<Integer>(1);
        // binarytreenode<Integer> node1 = new binarytreenode<Integer>(2);
        // root.left = node1;
        // binarytreenode<Integer> node2 = new binarytreenode<Integer>(3);
        // root.left = node2;

    }

}
