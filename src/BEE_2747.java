import java.util.Scanner;

/**
 * Output 1
 * 
 * Your programming teacher would like to make a screen with the following characteristics:
 * 
 * 1.Have 39 dashes (-) on the first line;
*  2.Have a | below the first dash and the thirty-ninth dash of the first line, fill in the middle with whitespace;
*  3.Repeat procedure 2 plus four times;
*  4.Repeat procedure 1.
 * 
 * At the end should look like the following image:
 * 
 *  ---------------------------------------   (39 traces)
 *  |                                     |
 *  |                                     |
 *  |                                     |
 *  |                                     |
 *  |                                     |
 *  ---------------------------------------   (39 traces)
 * 
 * 
 * Input
 * 
 * There is no.
 * 
 * Output
 * 
 * The output will be printed as shown above.
 * 
 * 
 */
public class BEE_2747 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
   
        System.out.println();

        for (int row = 0; row < 39; row++) {
            System.out.print("-");
        }

        System.out.println();

        for(int column = 0; column < 5; column++){
            System.out.println("|                                     |");
        }
         
        for (int row = 0; row < 39; row++) {
            System.out.print("-");
        }

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}