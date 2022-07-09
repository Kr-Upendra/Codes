import java.util.*;

public class Fibonacci {
    private static Scanner sc = new Scanner(System.in);

    // using loop
    private static int fib1(int n) {
        var n1 = 0; var n2 = 1;
        if (n == 0) return n1;
        for (var i = 2; i <= n; i++) {
            var c = n1 + n2;
            n1 = n2;
            n2 = c;
        }
        return n2;
    }

    // using Recursion 
    private static int fibRecursion(int n) {
        if (n == 0 || n == 1) return 1;
        return fibRecursion(n-1) + fibRecursion(n-2);
    }

    private static int fibDPMemo(int n, int[] dp) {
        if (n <= 1) {
            dp[n] = 1;
            return dp[n];
        }
        if (dp[n] == -1) return dp[n];
        dp[n] = fibDPMemo(n-1, dp) + fibDPMemo(n-2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        var n = sc.nextInt();
        var answer = fib1(n);
        var answer2 = fibRecursion(n);
        System.out.println(answer);
    }
}
