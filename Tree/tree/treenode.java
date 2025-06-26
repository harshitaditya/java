import java.util.ArrayList;

public class treenode<t> {
    public t data;
    public ArrayList<treenode<t>> children;

    public treenode(t data) {
        this.data = data;
        children = new ArrayList<>();
    }
}
