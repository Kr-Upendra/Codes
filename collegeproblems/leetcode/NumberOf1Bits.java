package collegeproblems.leetcode;

public class NumberOf1Bits {
    private static int hammingWeight(int n) {
        int length = 0;
        int k = 0;
        while (k < 32) {
            if ((n & 1) == 1) {
                length++;
            }
            n = n >>1;
            k++;
        }
        return length;
    }
}
