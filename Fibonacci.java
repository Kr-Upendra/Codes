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
        if (n == 0 || n == 1) return n;
        return fibRecursion(n-1) + fibRecursion(n-2);
    }

    // using Memoization 
    private static int fibDPMemo(int n, int[] dp) {
        if (n <= 1) {
            dp[n] = n;
            return dp[n];
        }
        if (dp[n] == -1) return dp[n];
        dp[n] = fibDPMemo(n-1, dp) + fibDPMemo(n-2, dp);
        return dp[n];
    }

    // using tabulation 
    private static int fibTabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        var n = sc.nextInt();
        int[] dp = new int[n+1];
        var answer = fib1(n);
        var answer2 = fibRecursion(n);
        var answer3 = fibDPMemo(n, dp);
        var answer4 = fibTabulation(n);
        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }
}
