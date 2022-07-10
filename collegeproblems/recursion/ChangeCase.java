package collegeproblems.recursion;


public class ChangeCase {
    private static void changeCase(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        String out1 = output;
        String output2 = output;
        out1 += input.charAt(0);
        output2 += Character.toUpperCase(input.charAt(0));
        input = input.substring(1);
        changeCase(input, out1);
        changeCase(input, output2);
    }

    public static void main(String[] args) {
        String str = "a1b2";
        changeCase(str, "");
    }


}
