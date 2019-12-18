import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Problem2 {
    ArrayList<String> out;

    public ArrayList<String> anagram(ArrayList<String> slist){
        HashMap<String, ArrayList> amap = new HashMap<>();
        ArrayList<String> retList = new ArrayList<>();
        for (String s : slist){
            String ss = sortString(s);
            if(!amap.containsKey(ss)){
                amap.put(ss, new ArrayList<String>());
            }
            amap.get(ss).add(s);
        }
        for (String key : amap.keySet()){
            for(Object s : amap.get(key)){
                retList.add((String) s);
            }
        }
        return retList;
    }

    public static String sortString(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
