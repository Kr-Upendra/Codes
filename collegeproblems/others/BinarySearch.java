package collegeproblems.others;
import java.util.*;


public class BinarySearch {
    private static int binarySearch(ArrayList<Integer> nums, int n , int k) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            var mid = start + ( end - start ) / 2;
            if (nums.get(mid) == k)
                return mid;
            else if (nums.get(mid) > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 34, 85, 99, 101);
        var result = binarySearch(arr, arr.size(), 2);
        System.out.println("Element is present at index " + result);
    }
}
