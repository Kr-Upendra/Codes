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

    public static void main(String[] args) {
        var n = sc.nextInt();
        var answer = fib1(n);
        System.out.println(answer);
    }
}
