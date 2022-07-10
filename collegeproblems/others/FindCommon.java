package collegeproblems.others;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommon {
    static ArrayList<Integer> findCommon(int[] a1, int[] a2, int[] a3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length && k < a3.length) {
            if (a1[i] == a2[j] && a2[j] == a3[k]) {
                result.add(a1[i]);
                i++;
                j++;
                k++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else if (a2[j] < a3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 3, 3};
        int[] array2 = {3, 3, 3};
        int[] array3 = {3, 3, 3 };
        var output = findCommon(array1, array2, array3);
        HashSet<Integer> res = new HashSet<>(output);
        for (var i : res)
            System.out.println(i);
    }
}
