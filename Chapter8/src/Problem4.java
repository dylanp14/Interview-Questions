import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Problem4 {
    ArrayList<ArrayList<Object>> subsets;
    public Problem4(){
        subsets = new ArrayList<ArrayList<Object>>();
    }

    public ArrayList<ArrayList<Object>> powerSet(ArrayList<Object> set){
        if (!subsets.contains(set)){
            subsets.add(set);
        }
        for (int i = 0; i < set.size(); i++){
            powerSet(subsets.remove(i));
        }
    }
}
