package collegeproblems.others;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateByK {
    public static void rotateByK(ArrayList<Integer> arr, int k) {
        while (k != 0) {
            var first = arr.remove(0);
            arr.add(first);
            k--;
        }
    }

    public static void rotateByKRight(ArrayList<Integer> arr, int k) {
        var length = arr.size()-1;
        while (k != 0) {
            var first = arr.remove(length);
            arr.add(0, first);
            k--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        if (k == 0)
            return;
        reverse(nums, 0, length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);

    }

    static void reverse(int[] nums, int i, int j) {
        int mid = (i + j) / 2 - i, k = 0;
        while (k <= mid) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}
