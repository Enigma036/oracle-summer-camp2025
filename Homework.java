/**
 * Homework for Oracle Summer Camp
 * Author: Tomas Hanak
 */

public class Homework {
    public static void main(String[] args) {
        // Start of for loop
        final int start = 1;
        // End of for loop
        final int end = 99;

        // for loop
        for (int i = start; i <= end; i++) {
            // String for output
            String out = "";

            // is even
            if (i % 2 == 0) {
                out += "Baz";
            }
            // is divisible by 5
            if (i % 5 == 0) {
                out += "inga!";
            }

            // print output 
            if (out.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(out);
            }
        }
    }
}