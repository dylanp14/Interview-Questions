//Problem 1

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class NodeConnectSearch {
    private Node start;
    private Node end;
    private ArrayList<Node> visited;
    private Queue<Node> unvisited;
    public NodeConnectSearch(Node s, Node e){
        this.start = s;
        this.end = e;

    }

    public boolean search(){
        //ArrayList<Node> graphNodes = graph.getNodes();
        visited = new ArrayList<Node>();
        unvisited = new LinkedBlockingQueue<Node>();
        unvisited.add(start);
        Node currentNode;
        while(!unvisited.isEmpty()){
            currentNode = unvisited.remove();

            if (currentNode.equals(end)){
                return true;
            }
            visited.add(currentNode);

            for (Node n : currentNode.getChildren()){
                if (visited.contains(n)){
                    unvisited.add(n);
                }
            }
        }
        return false;
    }
}