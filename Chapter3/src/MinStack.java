import java.util.Stack;

public class MinStack extends Stack<Integer> {
    Stack<Integer> minimums;

    public MinStack(){
        this.minimums = new Stack<Integer>();
    }

    public void push(int value){
        if (value <= minimums.peek() || minimums.isEmpty()){
            minimums.push(value);
        }
        super.push(value);
    }

    public Integer pop(){
        if(super.peek() == minimums.peek()){
            minimums.pop();
        }
        return super.pop();
    }

}
