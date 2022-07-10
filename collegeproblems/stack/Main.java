package collegeproblems.stack;

public class Main {
    public static void main(String[] args) {
        String str = "(())[]";
        var expression = new BalancedBrackets();
        var result = expression.isBalanced(str);
        System.out.println(result);
    }
}
