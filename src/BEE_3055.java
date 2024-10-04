import java.util.Scanner;

/**
 * Forgotten Mark
 * 
 * João learned at school that the average of two numbers is the value of the sum of these two numbers divided by two. That is, the average of two numbers A and B is M = (A+B)/2 .
 * The teacher told João the grades he got in the two Geography tests. The two scores are whole numbers between 0 and 100. João promptly calculated the average of the two tests, which also resulted in a whole number.
 * But João is very forgetful, and now he can't remember the two grades he got on the test. He can only remember one of his test scores. Luckily, he can also remember the average between the two notes. You can help
 * João determining the grade for the other test?
 * 
 * Input
 * 
 * The first line contains an integer A, indicating the grade for a test. The second line contains an integer M, indicating the average between the two test scores.
 * 
 * Output
 * 
 * Your program must produce a single line, with just one integer, the score from the other test, which João cannot remember.
 * 
 * Input Sample         Output Sample
 *      100                 40
 *      70
 * 
 *      80                  75
 *      75 
 * 
 *      1                   99
 *      50
 * 
 */
public class BEE_3055 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int A = scanner.nextInt();
            int M = scanner.nextInt();

           int B =  (M * 2) - A; 

            System.out.println(B);
            
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}