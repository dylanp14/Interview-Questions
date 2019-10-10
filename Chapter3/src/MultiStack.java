public class MultiStack {
    private int numberOfStacks = 3;
    private int capacity;
    private int[] stack;
    private int[] stackTracker;

    public MultiStack(int stackSize){
        this.capacity = stackSize;
        this.stack = new int[numberOfStacks * stackSize];
        this.stackTracker = new int[numberOfStacks];
    }

    public boolean isFull(int stackIndex){
        return stackTracker[stackIndex] == capacity;
    }

    public void push(int stackIndex, int value)throws Exception{
        if (isFull(stackIndex)){
            throw new Exception("Stack " + stackIndex + " Full");
        }
        stack[getIndex(stackIndex)] = value;

    }

    public int pop(int stackIndex) throws Exception{
        if (stackTracker[stackIndex] == 0){
            throw new Exception("Stack " + stackIndex + " Empty");
        }
        stackTracker[stackIndex]--;
        return stack[getIndex(stackIndex) + 1];
    }

    public int getIndex(int stackIndex){
        return stackIndex * capacity + stackTracker[stackIndex] - 1;
    }

}
