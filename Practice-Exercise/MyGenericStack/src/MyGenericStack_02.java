import java.util.ArrayList;

public class MyGenericStack_02<E> {
    private final ArrayList<E> stack;

    public MyGenericStack_02() {
        stack = new ArrayList<>();
    }

    public void push(E e) {
        stack.addLast(e);
    }

    public E pop() {
        return stack.removeLast();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
       return size() > 0;
    }
}
