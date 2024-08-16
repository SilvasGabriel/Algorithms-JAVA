import java.util.Scanner;

/*
 *  Quadrant
 * 
 *  Write a program to read the coordinates (X,Y) of an indeterminate number of points in the Cartesian system. 
 *  For each point, write the quadrant to which it belongs. 
 *  The algorithm will terminate when at least one of the two coordinates is NULL (in this situation without writing any message).
 * 
 * 
 *  Entry
 *  The input contains several test cases. Each test case contains 2 integer values.
 *
 *  Exit
 *  For each test case, show which quadrant of the Cartesian system the read coordinate is located in, as shown in the example.
 * 
 * 
 *  Input Example            Output Example
 *     2  2                     primeiro
 *     3 -2                     quarto
 *    -8 -1                     terceiro
 *    -7  1                     segundo
 *     0  2
 * 
 */

public class BEE_1115 {

    public static void main(String args []){

        try (Scanner read = new Scanner(System.in)){

            while (true) {
                
                //Read the value of the cordinates X and Y
                int X = read.nextInt();
                int Y =  read.nextInt();

                if(X > 0 && Y > 0){
                    System.out.println("primeiro");
                }else if (X > 0 && Y < 0) {
                    System.out.println("quarto");
                }else if(X < 0 && Y < 0){
                    System.out.println("terceiro");
                }else if (X < 0 && Y > 0) {
                    System.out.println("segundo");
                }
               
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
