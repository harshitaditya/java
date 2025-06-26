public class treeuse {
    public static void main(String args[]) {
        treenode<Integer> root = new treenode<Integer>(10);
        treenode<Integer> node1 = new treenode<Integer>(8);
        treenode<Integer> node2 = new treenode<Integer>(11);
        treenode<Integer> node3 = new treenode<Integer>(12);
        treenode<Integer> node4 = new treenode<Integer>(19);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        System.out.println(root);
    }

}
