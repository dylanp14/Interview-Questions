import java.util.ArrayList;
import java.util.HashMap;

public class Problem7 {

    private  ArrayList<String> permuations;
    public ArrayList<String> allPermutations(String s){
        ArrayList<String> retList = new ArrayList<>();
        char[] ca = s.toCharArray();
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
//        for (char c : ca){
//            if(!hashMap.containsKey(c)){
//                hashMap.put(c, 0);
//            }
//            else{
//                hashMap.replace(c, hashMap.get(c)+1);
//            }
//
//        }
        if (ca.length == 1){
            retList.add(String.valueOf(c));
            return retList;
        }
        for (int i =0; i < ca.length; i++){
            char c = ca[i];
            String ns;
            if (i == 0){
               ns = s.substring(i+1);
            }
            else if (i == ca.length-1){
                ns = s.substring(0, i-1);
            }
            else {
                ns = s.substring(0, i-1) + s.substring(i+1);
            }

            for (String x : allPermuations()){
                retList.add(String.valueOf(c) + x);

            }
        }
    }

}
