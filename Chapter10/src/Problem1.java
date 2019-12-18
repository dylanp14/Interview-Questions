public class Problem1 {
    public void mergeArray(int[] a, int[] b){
        int insertIndex;
        for (int i = 0; i < b.length; i++){
            insertIndex = binarySearch(a, b[i]);
            for (int j = insertIndex; j < a.length; j++){
                a[j+1] = a[j];
            }
            a[insertIndex] = b[i];
        }
    }
    public int binarySearch(int[] arr, int target){
        int mid = arr.length/2;
        int retIndex;
        if (arr[mid] > target){
            retIndex = binarySearch(arr, target, mid, arr.length-1);
        }
        else if (arr[mid] < target){
            retIndex = binarySearch(arr, target, 0, mid-1);
        }
        else if (arr[mid] == target){
            retIndex = mid;
        }
        else {
            retIndex = mid; // if target not found return closest index for insertion
        }
        return retIndex;
    }
    public int binarySearch(int[] arr, int target, int start, int end){
        int mid = start + (start - end)/2;
        int retIndex;
        if (arr[mid] > target){
            retIndex = binarySearch(arr, target, mid, end);
        }
        else if (arr[mid] < target){
            retIndex = binarySearch(arr, target, start, mid-1);
        }
        else if (arr[mid] == target){
            retIndex = mid;
        }
        else {
            retIndex = mid; // if target not found return closest index for insertion
        }
        return retIndex;
    }
}
