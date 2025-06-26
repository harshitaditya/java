import java.util.*;

public class tree_node<t> {
    public t data;
    public ArrayList<tree_node<t>> children;

    public tree_node(t data) {
        this.data = data;
        children = new ArrayList<>();

    }

    public static void main(String args[]) {
        tree_node<Integer> root = new tree_node<Integer>(10);
        tree_node<Integer> node1 = new tree_node<Integer>(10);
        tree_node<Integer> node2 = new tree_node<Integer>(10);
        tree_node<Integer> node3 = new tree_node<Integer>(10);
        tree_node<Integer> node4 = new tree_node<Integer>(10);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

    }

}
