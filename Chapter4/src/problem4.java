import java.util.ArrayList;
import java.util.LinkedList;

public class problem4 {

    public boolean checkBalanced(TreeNode root) {
        Problem3 problem3 = new Problem3();
        problem3.createDepthList(root);
        ArrayList<LinkedList<TreeNode>> depthList = problem3.getList();

        int depth = depthList.size() + 1;
        LinkedList<TreeNode> highestLevel = depthList.get(depth-1);
        int size = highestLevel.size();

        if (size == 1 && depthList.get(depth-2).size() == Math.pow(2,depth-1)){
            return true;
        }

        if (size == Math.pow(2, depth-1) || size == Math.pow(2, depth-1) - 1){
            return true;
        }
        return false;
    }

}
