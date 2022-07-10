package collegeproblems.divideNconquer;

public class XORSubset {
    static int rec(int i, int output, int[] nums) {
        if (i == nums.length) return output;
        int res1 = rec(i+1, output ^ nums[i], nums);
        int res2 = rec(i+1, output, nums);
        return res1 + res2;


    }

    static int xorSum(int[] nums) {
        return rec(0, 0, nums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(xorSum(nums));
    }
}
