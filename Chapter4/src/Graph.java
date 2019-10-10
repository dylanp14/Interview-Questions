import java.util.ArrayList;

class Graph{
    public ArrayList<Node> nodes;

    public void addNode(Node n){
        nodes.add(n);
    }

    public ArrayList<Node> getNodes(){
        return nodes;
    }

}