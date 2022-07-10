package collegeproblems.leetcode;

import java.util.HashSet;

public class LongestConSequence {
    public static int lcs(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        var max = 0;
        for (int j : nums) {
            int num = j;
            if (!set.contains(num - 1)) {
                int c = 1;
                while (set.contains(num + 1)) {
                    c++;
                    num++;
                }
                max = Math.max(max, c);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        var answer = lcs(nums);
        System.out.println(answer);
    }
}
