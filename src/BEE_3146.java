import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Riddles in the Dark
 * 
 * Many things have happened since the beginning of Bilbo's journey, Gandalf and the dwarves. While passing through the Misty Mountains, Bilbo separated from his friends and ended up in Gollum's cave.
 * Bilbo then finds a ring and realizes that this ring belonged to Gollum, because he is desperate behind it, but Bilbo feels something coming from the ring and keeps it to himself. Gollum is suspicious, and proposes to Bilbo a game of riddles, and if Bilbo lost, it would end right there. Bilbo is forced to accept the game.
 * Gollum, despite being a despicable creature, is very good at math, so he asks Bilbo a question involving circumference of circles (already thinking about his ring). Bilbo is afraid he won't be able to solve the riddle, so he broke the fourth wall and is asking you to create an algorithm that, given the radius R of the circle, returns the total size of the circumference.
 * Oh, and Gollum said, "You can consider the value of pi as 3.14, precious."
 * 
 * Input
 * 
 * A real R value indicating the size of the circle radius of Gollum's question.
 * 
 * Limits: 0 <R <= 10;
 * 
 * Output
 * 
 * A real value with two decimal places indicating the total size of the circle of Gollum's question circle.
 * 
 *  Input Samples	        Output Samples
 *      1.00                    6.28
 *      3.11                    19.53
 * 
 */
public class BEE_3146 {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            DecimalFormat twoHouses = new DecimalFormat("0.00");
            double radius = scanner.nextDouble();
            
            double circunference = (2 * 3.14) * radius;

            System.out.println(twoHouses.format(circunference));
            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}