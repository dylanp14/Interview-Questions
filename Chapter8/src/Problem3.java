import java.util.ArrayList;

public class Problem3 {
    public int magicIndex(ArrayList<Integer> arr){
        int mid = arr.size()/2;
        int ret = -1;
        if (arr.get(mid) == mid){
            return mid;
        }
        if (arr.get(mid) < mid){
            ret = magicIndex(arr, 0, mid);
        }
        if (arr.get(mid) > mid){
            ret = magicIndex(arr, mid, arr.size()-1);
        }
        return ret;
    }
    public int magicIndex(ArrayList<Integer> arr, int start, int end){
        int mid = start + (end-start/2);
        int ret = -1;

        if (arr.get(mid) == mid){
            return mid;
        }
        if (arr.get(mid) < mid){
            ret = magicIndex(arr, start, mid);
        }
        if (arr.get(mid) > mid){
            ret = magicIndex(arr, mid, end);
        }
        return ret;
    }
}
