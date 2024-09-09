/**
 * Output 2
 * 
 *  Your teacher would like to make a screen with the following characteristics:
 * 
 *  1.Have 39 dashes (-) on the first line;
 *  2.Have a | underneath the first dash and the thirty-ninth dash of the first line, below the dash should begin to write the word "Roberto" and the rest fill in the middle with white space;
 *  3.Have a | below the first dash and the thirty-ninth dash of the first line, fill in the middle with whitespace;
 *  4.Have a | below the first dash and the thirty-ninth dash of the first line, below the 10 dash you should begin to type the number "5786" and the rest fill in the middle with whitespace;
 *  5.Repeat procedure 3;
 *  6.Have a | underneath the first dash and the thirty-ninth dash of the first line, below the dash 10 should begin to write the word "UNIFEI" and the rest fill in the middle with white space;
 *  7.Repeat procedure 1.
 * 
 *  At the end should look like the following image:
 * 
 *  ---------------------------------------  (39 traces)
 *  |         Roberto                     |
 *  |                                     |
 *  |         5786                        |
 *  |                                     |
 *  |         UNIFEI                      |
 *  ---------------------------------------  (39 traces)
 * 
 * Input
 * 
 * There is not.
 * 
 * Output
 * 
 * The output will be printed as shown above.
 * 
 * 
 * 
 */
public class BEE_2748 {

    public static void main(String[] args) {

        System.out.println();
        
         // Print the top line of dashes
         System.out.printf("%s%n", "-".repeat(39));

         // Print the line with "Roberto"
         System.out.printf("|%10s%s%20s|%n", "","Roberto","");
 
         // Print empty line
         System.out.printf("|%37s|%n", "");
 
         // Print the line with "5786"
         System.out.printf("|%10s%s%23s|%n", "", "5786", "");
 
         // Print empty line
         System.out.printf("|%37s|%n", "");
 
         // Print the line with "UNIFEI"
         System.out.printf("|%10s%s%21s|%n", "", "UNIFEI", "");
 
         // Print the bottom line of dashes
         System.out.printf("%s%n", "-".repeat(39));
    }
}