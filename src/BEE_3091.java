import java.util.Scanner;

/**
 * Rest 1.0
 * 
 * John is a math student, but few people know that. One day, one of his classmates, thinking that John did not know basic math concepts, challenged him to perform a simple calculation which was: Calculate the rest of the division of A ÷ B.
 * Since John is very shy and you are best friends, he informed you what the answer to the problem was and asked you to pass this information on to this colleague who challenged him. You can do it ?
 * Given two integers A and B, tell what is the rest of division of A ÷ B John passed you.
 * 
 * Input
 * 
 * The input contains two integers A and B (1 <= A, B <= 100000).
 * 
 * Output
 * 
 * The output contains one unique integer that is the rest of division of A ÷ B.
 * 
 * 
 *   Input Samples	        Output Samples
 *      8                        2        
 *      3
 * 
 */
public class BEE_3091 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int A = read.nextInt();
            int B = read.nextInt();

            int rest =  A % B ;

            System.out.println(rest);

        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}