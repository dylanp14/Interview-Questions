public class problem5 {
    public boolean validateBST(TreeNode root){
        if (validateBST(root.left,Integer.MIN_VALUE, root.value) == true
            && validateBST(root.right, root.value, Integer.MAX_VALUE) == true){
            return true;
        }
        return false;
    }

    public boolean validateBST(TreeNode node, int min, int max){
        if(node.value < min || node.value > max){
            return false;
        }
        if (validateBST(node.left,min, node.value) == true
                && validateBST(node.right, node.value, max) == true){
            return true;
        }
        return false;
    }
}
