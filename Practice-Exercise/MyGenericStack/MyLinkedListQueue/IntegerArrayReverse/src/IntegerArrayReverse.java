import java.util.ArrayList;
import java.util.Stack;

public class IntegerArrayReverse<E> {
    private final Stack<E> afterReverse;
    public ArrayList<E> array;
    IntegerArrayReverse() {
        afterReverse = new Stack<>();
        array = new ArrayList<>();
    }
    public void reverseNumbers() {
        for (E arrayElement : array) {
            afterReverse.push(arrayElement);
        }
        int size = array.size();
        array.clear();
        for (int i = 0; i < size; i++) {
            array.add(i, afterReverse.pop());
        }
    }

//    public void reverse(int[] numbers) {
//        for (int number  : numbers) {
//            afterReverse.push((E)number);
//        }
//        for (int i = 0; i < numbers.length; i++) {
//          numbers[i] = afterReverse.pop();
//        }
//
//    }

    public void add(E e) {
        this.array.add(e);
    }

    public void printList() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (E arrayElement : array) {
            if (arrayElement.equals(array.get(array.size() - 1))) result.append(arrayElement).append("]");
            else result.append(arrayElement).append(", ");
        }
        System.out.println(result);
    }
}
