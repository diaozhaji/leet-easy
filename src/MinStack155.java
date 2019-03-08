import java.util.Stack;

public class MinStack155 {

    private Stack<Integer> stack = new Stack<>();
    private Integer top;
    private Integer min;

    /**
     * initialize your data structure here.
     */
    public MinStack155() {

    }

    public void push(int x) {

        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return top;
    }

    public int getMin() {
        return stack.size();
    }
}
