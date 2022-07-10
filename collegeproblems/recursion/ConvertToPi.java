package collegeproblems.recursion;

import java.util.Scanner;

public class ConvertToPi {
    static final Scanner sc = new Scanner(System.in);
    public String replacePi(String str) {  //    using recursion
        if (str.length() <= 1) return str;
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i')
            return "3.14" + replacePi(str.substring(2));
        return str.charAt(0) + replacePi(str.substring(1));
    }

    public StringBuilder replacePi2 (String str) {  // using iterative
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p' && str.charAt(i+1) == 'i') {
                result.append("3.14");
                i++;
            } else result.append(str.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        var ctp = new ConvertToPi();
        var input = sc.nextLine();
        var result = ctp.replacePi(input);
        var iteResult = ctp.replacePi2(input);
        System.out.println("Recursive Result: " + result);
        System.out.println("Iterative Result: " + iteResult);
    }


}
