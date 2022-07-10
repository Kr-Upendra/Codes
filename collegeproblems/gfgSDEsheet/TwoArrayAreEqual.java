package collegeproblems.gfgSDEsheet;

import java.util.Arrays;

public class TwoArrayAreEqual {

    public static boolean check(int[] a1, int[] a2) {
        int length = a1.length;
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i < length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 4, 0};
        int[] a2 = {2, 9, 5, 0, 1};
        var result = check(a1, a2);
        System.out.println(result);
    }
}
