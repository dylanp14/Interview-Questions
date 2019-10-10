import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;

public class SetOfStacks {
    ArrayList<Stack> stackSet;
    int threshold;
    int[] stackSizes;
    int stackIndex;

    public SetOfStacks(int thresh){
        this.threshold = thresh;
        this.stackSet = new ArrayList<Stack>();
        this.stackIndex = 0;
    }

    public void push(int value){
        if (isFull()) {
            stackSet.add(new Stack());
            stackIndex++;
        }
        stackSet.get(stackIndex).push(value);
    }

    public Object pop(int index){
        return stackSet.get(index).pop();
    }


    public boolean isFull(){
        if (getStackSize(stackIndex)==threshold){
            return true;
        }
        return false;
    }

    public int getStackSize(int index){
        return stackSet.get(index).size();
    }
}
