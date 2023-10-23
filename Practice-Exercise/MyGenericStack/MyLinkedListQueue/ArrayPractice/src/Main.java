// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();

        int index = 1;
        for (int element : stack.arr) {
            System.out.println("Element " + index + ": " + element );
            index++;
        }
//        System.out.println("Size: " + stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.isFull());


        System.out.println(((new MyStack()).convertDecimalToBinary(174)).toString());
    }
}