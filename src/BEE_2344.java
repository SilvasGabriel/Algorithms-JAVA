import java.util.Scanner;
/**
 * Test Notes
 * 
 * Rosy is a talented high school teacher who has won many awards for the quality of her teaching. Her recognition was such that she was invited to teach at a school in England. Even though she spoke English well, Rosy was a little apprehensive about the responsibility, but decided to accept the proposal and see it as a good challenge.
 * Everything went well for Rosy until the day of the test. Used to giving grades from 0 (zero) to 100 (one hundred), she did the same in the first test for students in England. However, the students found it strange, as in England the grading system is different: grades must be given as grades from A to E. Grade A is the highest, while grade E is the lowest.
 * Talking to other teachers, she received the suggestion to use the following table, relating numerical scores to concept scores:
 * 
 * 
 *          Notes     | Concept
 *           0        |  E
 *          1 to 35   |  D
 *          36 to 60  |  C
 *          61 to 85  |  B
 *          86 to 100 |  A
 * 
 * The problem is that Rosy has already given the grades in the numerical system, and will have to convert the grades to the letter system. However, Rosy needs to prepare the next classes (to maintain the quality that made her recognized), and she doesn't have enough time to convert the grades manually.
 * You must write a program that takes a note in the number system and determines the corresponding concept.
 * 
 * Input
 * 
 * The input contains a single test set, which must be read from the standard input device (typically the keyboard). The input contains a single line with an integer N (0 ≤ N ≤ 100), representing a test score in the numerical system.
 * 
 * Output
 * 
 * Your program must print, on standard output, a letter (A, B, C, D, or E in capital letters) representing the concept corresponding to the grade given in the input.
 * 
 * Input Sample     Output Sample
 *      12              D
 *      87              A
 *      0               E
 * 
 */
public class BEE_2344 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int nota = read.nextInt();

            if(nota == 0){
                System.out.println("E");
            }else if(nota >= 1 && nota <= 35){
                System.out.println("D");
            }else if( nota >= 36 && nota <= 60){
                System.out.println("C");
            }else if(nota >= 61 && nota <= 85){
                System.out.println("B");
            }else{
                System.out.println("A");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}