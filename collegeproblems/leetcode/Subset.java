package collegeproblems.leetcode;

import java.util.*;

public class Subset {
    private static void printSubset(int[] nums, int index, List<Integer> output, HashSet<String> set) {
        if (nums.length == index) {
            Collections.sort(output);
            set.add(output.toString());
            return;
        }
        output.add(nums[index]);
        printSubset(nums, index + 1, output, set);
        output.remove(output.size() - 1);
        printSubset(nums, index+1, output, set);
    }


    private static List<String> doUnique(int[] nums) {
        HashSet<String> set = new HashSet<>();
        List<Integer> op = new ArrayList<>();
        printSubset(nums, 0, op, set);
        return new ArrayList<>(set);
    }


//    ---------------------------------------------------------

    private static void findSubset(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            findSubset(nums, i+1, list, result);
            list.remove(list.size() - 1);
        }
    }

    private static List<List<Integer>> uniqueSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        findSubset(nums, 0, new ArrayList<>(), result);
        return result;
    }





    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        var result = uniqueSubset(nums);
        System.out.println(result);
    }
}
