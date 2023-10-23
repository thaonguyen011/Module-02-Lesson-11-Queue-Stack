import java.util.Stack;

public class CheckBracket {

    public static boolean checkBracket(String operator) {
        Stack<Character> bStack = new Stack<>();
        int size = 0;

        for (int i = 0; i < operator.length(); i++) {
            char sym = operator.charAt(i);
            if ( sym == '(' ) {
                bStack.push(sym);
                size++;
            }
            else if ( sym == ')') {
                if (bStack.isEmpty()) return false;
                bStack.pop();
            }
        }
        if (size == 0) throw new RuntimeException("operator does not have bracket");
        return bStack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(checkBracket("s*(s-a)*(s-b)*(s-c)"));
        System.out.println(checkBracket("s*(s-a*(s-b)*(s-c"));
        System.out.println(checkBracket("s*(s-a*(s-b)*(s-c"));
//        System.out.println(checkBracket("abc"));
        System.out.println(checkBracket("(ab"));
    }
}
