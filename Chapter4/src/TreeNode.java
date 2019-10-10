import javax.print.attribute.standard.MediaSize;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public boolean equals(TreeNode other){
        if (this.value == other.value){
            return true;
        }
        return false;
    }
}
