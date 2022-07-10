package collegeproblems.recursion;


public class MoveAllX {

    private static String solution(String str) {
        if (str.length() == 0) return str;
        if (str.charAt(0) == 'x')
            return solution(str.substring(1, str.length()-1)) + str.charAt(0);
        else
            return str.charAt(0) + solution(str.substring(1));

    }

    public static void main(String[] args) {
        String s = "axxabs";
        var result = solution(s);
        System.out.println(result);
    }

}
