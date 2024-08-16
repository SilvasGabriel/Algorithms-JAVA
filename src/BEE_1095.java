/*
 * IJ Sequence 1
 * 
 *  You must make a program that presents the sequence as shown in the example below.
 *
 *  Entry
 *  There is no entry in this issue.
 *
 *  Exit
 *  Print the sequence as shown in the example below
 * 
 *      I=1 J=60
 *      I=4 J=55
 *      I=7 J=50
 *      ...
 *      I=? J=0
 * 
 */

public class BEE_1095{

    public static void main(String[] args) {
        
        try{
            
            int J = 60;
            int i = 1;
            
            //For start the look i start with 1 and adds 3 and J startas with 60 
            //and reduce 5 each time until reaches 0.

            while (i<60 && J>0) {
                i = i + 3;
                J = J - 5;
                System.out.println("I = " + i + " J = " + J);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}