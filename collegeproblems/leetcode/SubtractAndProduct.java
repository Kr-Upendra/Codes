package collegeproblems.leetcode;

public class SubtractAndProduct {

    private static int sum(int n) {
        if (n != 0)
            return (n % 10 + sum(n / 10));
        else return 0;
    }
    private static int product(int n) {
        int result = 1;
        while (n > 0) {
            var rem = n % 10;
            result *= rem;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        var n = 4421;
        var result = product(n) - sum(n);
        System.out.println(result);
    }
}
