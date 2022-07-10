package collegeproblems.recursion;

import collegeproblems.collections.Hashset;

import java.util.*;

public class Subset2 {
    private static void changeCase2(String input, String output, Set<String> set) {

        if (input.length() == 0) {
            set.add(output);
            return;
        }
        var output1 = output;
        var output2 = output;
        output1 += input.charAt(0);
        output2 += Character.toUpperCase(input.charAt(0));
        input = input.substring(1);
        changeCase2(input, output1, set);
        changeCase2(input, output2, set);
    }

    private static List<String> removeDP(String input) {
        List<String> ans = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        changeCase2(input, "", res);
        for (var a : res) {
            ans.add(a);
        }
        return ans;
    }

    public static void main(String[] args) {
        var input = "a1b2";
        var output = "";
        var result = removeDP(input);
        for (var i : result)
            System.out.print(i + " ");
    }

}
