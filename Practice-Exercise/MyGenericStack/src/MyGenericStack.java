import java.util.LinkedList;

public class MyGenericStack <T> {
    private final LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }


    public void push (T element) {
        stack.addLast(element);
    }


    public T pop() {
        return stack.removeLast();
    }


    public int size() {
        return stack.size();
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
