import java.util.*;

public class takeinput {
    public static treenode<Integer> inputnode(Scanner s) {
        int n;
        System.out.println("Enter the next data: ");
        n = s.nextInt();
        treenode<Integer> root = new treenode<Integer>(n);
        System.out.println("Enter the child of a node: " + n);
        int childcount = s.nextInt();
        for (int i = 0; i < childcount; i++) {
            treenode<Integer> child = inputnode(s);
            root.children.add(child);

        }
        return root;

    }

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

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        treenode<Integer> root = inputnode(s);
        print(root);

    }
}
