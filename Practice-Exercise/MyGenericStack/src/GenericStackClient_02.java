public class GenericStackClient_02 {

        private static void stackOfString() {
            MyGenericStack_02<String> stack = new MyGenericStack_02<>();
            stack.push("Five");
            stack.push("Four");
            stack.push("Three");
            stack.push("Two");
            stack.push("One");
            System.out.println("1.1 Size of stack after push operations: " + stack.size());
            System.out.println(stack.isEmpty());
            System.out.print("1.2 Pop elements from stack: ");
            while (!stack.isEmpty()) {
                System.out.printf(" %s", stack.pop());
            }
            System.out.println("\n1.3. Size os stack after pop operations: " + stack.size());
            System.out.println(stack.isEmpty());
        }

        private static void stackOfInteger() {
            MyGenericStack_02<Integer> stack = new MyGenericStack_02<>();
            stack.push(5);
            stack.push(4);
            stack.push(3);
            stack.push(2);
            stack.push(1);

            System.out.println("2.1 Size of stack after push operations: " + stack.size());
            System.out.print("2.2 Pop elements from stack: ");
            while (!stack.isEmpty()) {
                System.out.printf(" %d", stack.pop());
            }
            System.out.println("\n2.3. Size os stack after pop operations: " + stack.size());

        }

        public static void main(String[] args) {
            System.out.println("1. Stack of Strings");
            stackOfString();
            System.out.println("2. Stack of Integer");
            stackOfInteger();
        }
    }


