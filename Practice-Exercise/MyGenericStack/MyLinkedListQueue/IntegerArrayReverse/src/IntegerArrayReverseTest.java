public class IntegerArrayReverseTest {
    static void integerReverse() {
        IntegerArrayReverse<Integer> list = new IntegerArrayReverse<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List before reverse: ");
        list.printList();

        list.reverseNumbers();
        System.out.println("List after reverse: ");
        list.printList();
    }

    static void stringReverse() {
        IntegerArrayReverse<String> list = new IntegerArrayReverse<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println("List before reverse: ");
        list.printList();

        list.reverseNumbers();
        System.out.println("List after reverse: ");
        list.printList();
    }

    public static void main(String[] args) {
        integerReverse();
        System.out.println();
        stringReverse();





    }
}
