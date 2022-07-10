package collegeproblems.recursion;

public class RemoveDuplicates {
    public static String solution(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1))
            return solution(str.substring(1));
        else
            return str.charAt(0) + solution(str.substring(1));
    }

    public static void main(String[] args) {
        String s = "aassaaaabbbbbbb";
        String result = solution(s);
        System.out.println(result);
    }
}
