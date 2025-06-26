import java.util.*;
public class binarytreeuse {
    public static binarytreenode<Integer> takeinputLevelwise(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data: ");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        binarytreenode<Integer> root=new binarytreenode<Integer>(rootdata);
        Queue<binarytreenode<Integer>> pendingnodes=new LinkedList<>();
        pendingnodes.add(root);
        while(!pendingnodes.isEmpty()){
            binarytreenode<Integer> front=pendingnodes.poll();
            System.out.println("Enter the leftchild of: "+front.data);
            int leftdata=s.nextInt();
            if(leftdata!=-1){
                binarytreenode<Integer> child = new binarytreenode<Integer>(leftdata);
                front.left=child;
                pendingnodes.add(child);
            }
            System.out.println("Enter the rightchild of: "+front.data);
            int rightdata=s.nextInt();
            if(rightdata!=-1){
                binarytreenode<Integer> child = new binarytreenode<Integer>(rightdata);
                front.right=child;
                pendingnodes.add(child);
            }
        }
        return root;
        
    }
    
    public static void main(String args[]){
       

    }
    
}
