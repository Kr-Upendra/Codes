package collegeproblems.backtracking;

import java.util.Scanner;

public class FindPower {
    private static int findPower(int x, int m) {
        int result;
        if (m == 0) return 1;
        result = findPower(x, m / 2);
        if (m % 2 == 0)
            return result * result;
        else
            return x * result * result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = findPower(m, n);
        System.out.println(res);
    }
}
