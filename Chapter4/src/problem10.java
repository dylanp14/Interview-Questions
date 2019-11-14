public class problem10 {

    public boolean searchTree(TreeNode t1, TreeNode t2){
        if(t1.value == t2.value){
            if(checkSubTree(t1.left, t2.left) && checkSubTree(t1.right, t2.right)){
                return true;
            }
        }
        if(searchTree(t1.left, t2) || searchTree(t1.left, t2)){
            return true;
        }
        return false;
    }

    public boolean checkSubTree(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1.value != t2.value){
            return false;
        }
        if(checkSubTree(t1.left, t2.left) && checkSubTree(t2.right, t2.right)){
            return true;
        }
        return true;
    }
}
