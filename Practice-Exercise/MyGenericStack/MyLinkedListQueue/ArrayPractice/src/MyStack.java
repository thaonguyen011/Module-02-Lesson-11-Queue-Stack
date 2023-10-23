import java.util.Arrays;

public class MyStack {
    public int[] arr;
    private int size;
    private int index;

    private static final int DEFAULT_SIZE = 10;

    MyStack(int size) {
        notANegativeInteger(size);
        arr = new int[size];
        this.size= size;
    }

    MyStack() {
        arr = new int[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    private void notANegativeInteger(int number) {
        if (number < 0) throw new RuntimeException("invalid number");
    }

    private void isNull() {
        if (size == 0) throw new RuntimeException("array is null");
    }


    public void push(int element) {
       isNull();
       if (isFull()) System.out.println("array if full");
       else arr[index] = element;
       index++;
    }

    public int pop() {
        int result;

       isNull();
       if (isEmpty()) result = Integer.parseInt(null);
       result = arr[index - 1];

       int[] newArr = new int[index - 1];
        System.arraycopy(arr, 0, newArr, 0, index -1);
        arr = newArr;
        index--;
        return result;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index >= size;
    }

    public int size() {
        return index;
    }

    public int[] convertDecimalToBinary(int number){
        int resultElement = 0;
        while (number != 0) {
            resultElement = number % 2;
            ensureSize();
            push(resultElement);
            number = number/2;
        }
        int index2 = index;
        System.out.println("index: "+ index2);
        int[] newArr = new int[index2]; //tạo 1 mảng riêng để thao tác rồi gán lại cho mảng cũ sẽ tốt
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = pop();
            System.out.println(newArr[i]);
        }
        arr = newArr;
        return arr;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int element : arr) {
            result.append(element).append(",");
        }
        return result.toString();
    }

    public void ensureSize() {
        if (isFull()) {
            size = 2 * size;
            int[] newArr = new int[size];
            System.arraycopy(arr, 0, newArr, 0, index);
            arr = newArr;
        }
    }
}
