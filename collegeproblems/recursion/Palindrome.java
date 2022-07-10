package collegeproblems.recursion;

import java.util.Scanner;

public class Palindrome {
    public static final Scanner sc = new Scanner(System.in);
    static boolean checkPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) return true;
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            System.out.println(str);
            return checkPalindrome(str.substring(1, str.length() - 1));
        }
        else return false;
    }
    public static void main(String[] args) {
        var str = sc.nextLine();
        var result = checkPalindrome(str);
        if (result) System.out.println("Yes");
        else System.out.println("No");
    }

}
