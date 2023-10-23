
import java.util.Stack;

public class String1 {
    public static boolean isPalindrome(String s) {
        Stack<Character> sToCharArr = new Stack<>();
        s = s.toLowerCase();
        char[] sChars = s.toCharArray();

        for (char sChar : sChars) {
            sToCharArr.push(sChar);
        }
        for (int i = 0; i < sToCharArr.size(); i++) {
           if (sToCharArr.pop() != sChars[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while ( i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(String1.isPalindrome("Able was I ere I saw elbA"));
        System.out.println(String1.isPalindrome1("Hello"));
        System.out.println(String1.isPalindrome1("ollo"));
        System.out.println(String1.isPalindrome1("AblewasIereIsawElbA"));
    }


}
