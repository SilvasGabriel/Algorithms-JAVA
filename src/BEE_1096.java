/*
 *  IJ Sequence 2
 * 
 *   You must make a program that presents the sequence as shown in the example below.
 *
 *   Entry
 *   There is no entry in this issue.
 *
 *   Exit
 *   Print the sequence as shown in the example below
 * 
 *       I=1 J=7
 *       I=1 J=6
 *       I=1 J=5
 *       I=3 J=7
 *       I=3 J=6
 *       I=3 J=5
 *       ...
 *       I=9 J=7
 *       I=9 J=6
 *       I=9 J=5
 * 
 */

public class BEE_1096 {

    public static void main(String[] args) {
        
        //in the output above i starts in 1 and finish in 9 adding two each time
        for (int i = 1; i <= 9; i+=2) {
            
            //and the j starts with 7 and is bigger or equal five reducing the value repeating.
            for (int j = 7; j >= 5; j--) {
                System.out.println("I = " + i + " J = " + j);
            }
            
        }
    }
    
}