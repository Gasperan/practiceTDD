/**
 * Created by michaelsoza on 4/4/17.
 */
public class MyStack {
    private int[] memory;
    private int top;

    public MyStack() {
        memory = new int[100];
        top = 0;
    }

    public int getSize() {
        return top;
    }

    public void push(int value) {
        memory[top++] = value;
    }

    public int peek() {
        return memory[top-1];
    }

    public int pop() throws StackUnderflowException {

        if (top > 0) {
        return memory[--top];
       }

       throw new StackUnderflowException();
    }
}
