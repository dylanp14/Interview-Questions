import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Trees {

    private Stack<TreeNode> path;

    //Problem 2
    public TreeNode createMinBST(List<Integer> array){
        TreeNode n = new TreeNode();
        int mid = (array.size()-1)/2;
        n.value = mid;
        n.left = createMinBST(array.subList(0, mid-1));
        n.right = createMinBST(array.subList(mid, array.size()-1));

        return n;
    }


    //problem 8
    public boolean findNodePath(TreeNode currentNode, TreeNode node){

        path.add(currentNode);
        if(currentNode.equals(null)) {
            path.pop();
            return false;
        }
        if(currentNode.equals(node)){
            return true;
        }
        if (findNodePath(currentNode.left, node) == true){
            return true;
        }
        else if (findNodePath(currentNode.right, node) == true){
            return true;
        }
        else {
            path.pop();
            return false;
        }

    }

    public TreeNode firstCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) throws Exception{
        path = new Stack<TreeNode>();
        LinkedBlockingQueue<TreeNode> ancestorPath1 = new LinkedBlockingQueue<TreeNode>();
        Hashtable<Integer, Integer> ancestorPath2 = new Hashtable<>();
        if(findNodePath(root, n1) == false){
            throw new Exception("Node " + n1 + " not found in tree");
        }
        while(!path.isEmpty()){
            ancestorPath1.put(path.pop());
        }
        if(findNodePath(root, n2) == false){
            throw new Exception("Node " + n2 + " not found in tree");
        }
        while(!path.isEmpty()){
            ancestorPath2.putIfAbsent(path.pop().value, null);
        }
        TreeNode trace;
        while(!ancestorPath1.isEmpty()){
            trace = ancestorPath1.remove();
            if (ancestorPath2.containsKey(trace.value)){
                return trace;
            }
        }
        return null;

    }
}
