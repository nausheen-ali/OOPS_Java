import java.util.*;

class commaFormatter {
    public static void main(String[] args) {
	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "";
        int len = input.length();
        
        for (int i = len - 1; i >= 0; i--) {
            output = input.charAt(i) + output;
            if ((len - i) % 3 == 0 && i > 0) {
                output = "," + output;
            }
        }
        System.out.println("Output:" +output);
    }
}