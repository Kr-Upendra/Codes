import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedBrackets {

    private static final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private static final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (isLeft(ch)) stack.push(ch);
            if (isRight(ch)) {
                if (stack.empty()) return false;
                var top = stack.pop();
                if (!isMatched(top, ch))
                    return false;
            }
        }
        return stack.empty();
    }

    private static boolean isLeft(char ch) {
        return leftBrackets.contains(ch);
    }

    private static boolean isRight(char ch) {
        return rightBrackets.contains(ch);
    }

    private static boolean isMatched(char left, char right) {
       return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
