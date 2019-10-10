import java.util.ArrayList;

class Node{
    public String name;
    private ArrayList<Node> children;
    public int value;

    public Node(){
        children = new ArrayList<Node>();
    }

    public void addChildren(Node n){
        children.add(n);
    }

    public ArrayList<Node> getChildren(){
        return children;
    }


    public boolean equals(Node n){
        if (n.value == this.value){
            return true;
        }
        return false;
    }
}