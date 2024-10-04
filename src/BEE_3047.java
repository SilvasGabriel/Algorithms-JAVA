import java.util.Scanner;

/**
 * Dona Mônica’s age
 * 
 * Dona Mônica is the mother of three children of different ages. She noticed that, this year, the sum of the ages of her three children is equal to her age. In this problem, given Mônica's age and the ages of two of her children, your program must compute and print the age of the oldest child. For example, if we know that Mrs. Mônica is 52 years old and the known ages of two of her children are 14 and 18 years old, then the age of the other son, who was not known, has to be 20 years old, as the sum of the three ages has must be 52. Therefore, the age of the eldest son is 20. In yet another example, if Mrs. Mônica is 47 years old and the ages of two of her children are 21 and 9 years old, then the other son must be 17 years old and, therefore, the age of the eldest son is 21.
 * 
 * Input 
 * 
 * The first line of the entry contains an integer M representing Mônica's age. The second line of the input contains an integer A representing the age of one of the children. The third line of the input contains an integer B representing the age of another child.
 * 
 * Output
 * 
 * Your program must print a line, containing an integer, representing the age of Mônica's eldest son.
 * 
 * Input Sample         Output Sample
 *      52                  20
 *      14
 *      18
 * 
 *      47                  21
 *      21
 *      9
 */
public class BEE_3047 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int donaMonicaAge = read.nextInt();
            int firstChild = read.nextInt();
            int secondChild = read.nextInt();
            
            int thirdChild = donaMonicaAge - (firstChild + secondChild);
            
            if(firstChild > secondChild && firstChild > thirdChild){
                System.out.println(firstChild);
            }

            if(secondChild > firstChild && secondChild > thirdChild){
                System.out.println(secondChild);
            }

            if(thirdChild > firstChild && thirdChild > secondChild){
                System.out.println(thirdChild);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}