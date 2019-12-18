public class problem1 {

    public int tripleStep(int n){
        int count = 0;
        if (n > 3){
            count += tripleStep(n-3);
            count += tripleStep(n-2);
            count += tripleStep(n-1);
        }
        else if (n == 3){
            count += tripleStep(n-2);
            count += tripleStep(n-1);
            count += 1;
        }
        else if (n == 2){
            count += tripleStep(n-1);
            count += 1;
        }
        else if (n == 1){
            count += 1;
        }
        else return -1;

        return count;
    }

}
