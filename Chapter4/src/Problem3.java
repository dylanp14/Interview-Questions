import java.util.ArrayList;
import java.util.LinkedList;

public class Problem3 {
    private ArrayList<LinkedList<TreeNode>> nodesByDepth;
    private int depth;

    public Problem3(){
        nodesByDepth = new ArrayList<LinkedList<TreeNode>>();
    }

    public void createDepthList(TreeNode root){
        nodesByDepth.add(0, new LinkedList<TreeNode>());
        nodesByDepth.get(0).add(root);
        createDepthList(root.left, 1);
        createDepthList(root.right, 1);
    }

    public void createDepthList(TreeNode node, int depth){
        if (node.equals(null)){
            return;
        }
        if (nodesByDepth.get(depth).equals(null)){
            nodesByDepth.add(depth, new LinkedList<TreeNode>());
        }

        nodesByDepth.get(depth).add(node);

        createDepthList(node.left, depth + 1);
        createDepthList(node.right, depth + 1);

    }

    public ArrayList<LinkedList<TreeNode>> getList(){
        return nodesByDepth;
    }
}
