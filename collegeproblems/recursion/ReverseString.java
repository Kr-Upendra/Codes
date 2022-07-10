package collegeproblems.recursion;

import java.util.Scanner;

public class ReverseString {
    public static Scanner sc = new Scanner(System.in);
    public static String reverse(String str) {
        if (str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        var str = sc.nextLine();
        var result = reverse(str);
        System.out.println(result);
    }
}
