import java.util.Scanner;

/*
 *  Ho Ho Ho
 * 
 *  Santa Claus is playing with his elves to entertain them during the Christmas Eve. The game consists of the elves writing numbers on pieces of paper and place on the cap of Santa Claus. After all finished to put the numbers, Santa draws a number and that number is how many "Ho" he should say.
 *
 *  Your job is to help Santa Claus by making a problem that shows all the "Ho" that he should speak given the number drawn.
 *  
 *  Input
 * 
 *  The input consists of a single integer N (0 < N ≤ 106) representing how many "Ho" will be spoken by Santa.
 *
 *  Output
 *
 *  The output consists of all "Ho" that Santa should speak separated by a space. After the last "Ho" you must present an "!" ending the program.
 *
 *  Input Sample	    Output Sample
 *       5                  
 * 
 * 
 * 
 * 
 */

public class BEE_1759 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {

            int number = read.nextInt();

            if (number > 0) {
                for (int i = 0; i < number; i++) {
                    System.out.print("Ho ");
                    if(i == number - 1){
                        System.out.print("Ho!");
                    }
                    
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
