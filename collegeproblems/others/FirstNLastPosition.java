package collegeproblems.others;

import java.util.ArrayList;
import java.util.Collections;

public class FirstNLastPosition {
    private static int firstPosition(ArrayList<Integer> nums, int k) {
        var start = 0;
        var end = nums.size() - 1;
        var left = -1;
        while (start <= end) {
            var mid = start + (end - start) / 2;
            if (nums.get(mid) == k) {
                left = mid;
                end = mid - 1;
            }
            else if (nums.get(mid) > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return left;
    }

    private static int lastPosition(ArrayList<Integer> nums, int k) {
        var start = 0;
        var end = nums.size() - 1;
        var right = -1;
        while (start <= end) {
            var mid = start + (end - start) / 2;
            if (nums.get(mid) == k) {
                right = mid;
                start = mid + 1;
            } else if (nums.get(mid) > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return right;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 2, 3, 3, 3, 3, 9);
        var leftIndex = firstPosition(nums, 3);
        var rightIndex = lastPosition(nums, 3);
        System.out.println(leftIndex + " " + rightIndex);
    }
}
