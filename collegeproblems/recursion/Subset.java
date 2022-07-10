package collegeproblems.recursion;

public class Subset {
    private static void subset(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        String taken = output + input.charAt(0);
        input = input.substring(1);
        subset(input, output);
        subset(input, taken);
    }

    private static void subset2(String input, String output) {
        if (input.length() == 0) {
            if (!output.equals(""))
                System.out.println(output);
            return;
        }
        subset2(input.substring(1), output);
        subset2(input.substring(1), output + input.charAt(0));
        subset2(input.substring(1), output + (int) input.charAt(0));
    }

    public static void main(String[] args) {
        String str = "abc";
        String output = "";
        subset2(str, output);
    }
}
