import java.util.ArrayList;

public class Problem3 {
    public int rotatedSearch(ArrayList<Integer> arr, int val){
        int x = Integer.MIN_VALUE + 1;
        int prev = Integer.MIN_VALUE;
        int exp = 0;
        while(x > prev && !(Math.pow(2,exp) > arr.size())){
            prev = x;
            x = arr.get((int)Math.pow(2,exp));
            exp++;
        }
        int a = x;
        int b;
        int ridx=0;
        for(int i=(int)Math.pow(2,exp-1)-1; i>Math.pow(2,exp-2); i--){
            b = a;
            a = arr.get(i);
            if(a > b){
                ridx = i;
                break;
            }
        }
        int retIndex;
        if (val < arr.get(0) ){
            retIndex = binarySearch(arr, val, ridx, arr.size()-1);
        }
        else {
            retIndex = binarySearch(arr,val, 0, ridx)
        }
        return retIndex;
    }

    public int binarySearch(ArrayList<Integer> arr, int target, int start, int end){
        int mid = start + (start - end)/2;
        int retIndex;
        if (arr.get(mid) > target){
            retIndex = binarySearch(arr, target, mid, end);
        }
        else if (arr.get(mid)< target){
            retIndex = binarySearch(arr, target, start, mid-1);
        }
        else if (arr.get(mid) == target){
            retIndex = mid;
        }
        else {
            retIndex = -1; // if target not found return closest index for insertion
        }
        return retIndex;
    }
}
