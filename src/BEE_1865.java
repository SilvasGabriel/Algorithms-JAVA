import java.util.Scanner;
/*
 *  Mjölnir
 * 
 *  Odin created to Thor the most faithful and powerful possible weapon, Mjolnir hammer. Made of a special mystical ore called Uru and forged in the heart of a star by blacksmiths Gods of Asgard , Brokk and Eitri , blacksmiths legendary.
 *
 *  One day , Thor challenged his friends to see who could raise the Mjölnir .
 *
 *  Write a program that , given a name , and the force in Newtons applied to try to lift the Thunder Hammer , inform the person succeeded in lifting it .
 *
 *  Input
 *  
 *  An integer C shall be informed , which is the amount of test cases. Each test case begins with one word , which is the first name of who is trying to raise Mjölnir , and an integer N ( 1 ≤ N ≤ 25000 ), indicating the force applied upward in Newtons to pull the hammer of so try to lift it.
 *
 *  Output
 *  
 *  For each test case print a 'Y' character , if the person has managed to raise or 'N' if you have not achieved .
 * 
 *  Input Sample	        Output Sample
 *      4                         N
 *      Hulk 5000                 N
 *      Tony 1000                 Y
 *      Thor 50                   N
 *      Steve 500
 * 
 * 
 */
public class BEE_1865 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int amountOfTests = read.nextInt();

            if (amountOfTests > 0) {
                
                for (int i = 0; i < amountOfTests; i++) {
                    String avangerName = read.next();
                    @SuppressWarnings("unused")
                    int power = read.nextInt();

                    if(!(avangerName.equals("Thor"))){
                        System.out.println("N");
                    }else{
                        System.out.println("Y");
                    }
                }

            }



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}