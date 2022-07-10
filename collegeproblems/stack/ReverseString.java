package collegeproblems.stack;

import java.util.Stack;

public class ReverseString {

    public String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuilder result = new StringBuilder();
        while (!stack.empty())
            result.append(stack.pop());

        return result.toString();
    }
}
