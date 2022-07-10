package collegeproblems.divideNconquer;

import java.util.Scanner;

public class FindMinMax {
    private static int[] findMinMax(int[] nums, int l, int r) {
        int min, max;
        if (l == r) {
            max = nums[l];
            min = nums[l];
        } else if (l + 1 == r) {
            if (nums[l] < nums[r]) {
                max = nums[r];
                min = nums[l];
            } else {
                max = nums[l];
                min = nums[r];
            }
        } else {
            var mid = l + (r - l) / 2;
            int[] lMinMax;
            int[] rMinMax;
            lMinMax = findMinMax(nums, l, mid);
            rMinMax = findMinMax(nums, mid+1, r);
            max = Math.max(lMinMax[0], rMinMax[0]);
            min = Math.min(lMinMax[1], rMinMax[1]);

        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        var result = findMinMax(arr, 0, n-1);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
