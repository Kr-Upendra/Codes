package collegeproblems.leetcode;

public class PeakElement {
    private static int peak(int[] nums) {
        var start = 0;
        var end = nums.length - 1;
        while (start < end) {
            var mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1])
                start = mid + 1;
            else
                end = mid;

        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int result = peak(nums);
        System.out.println(result);
    }

}
