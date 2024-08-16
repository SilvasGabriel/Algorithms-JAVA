/*
 * IJ Sequence 3
 *  
 *  You must make a program that presents the sequence as shown in the example below.
 *
 *   Entry
 *   There is no entry in this issue.
 *
 *   Exit
 *   Print the sequence as per the example below.
 * 
 *   I=1 J=7 -> J - i -> 7 - 1 = 6
 *   I=1 J=6
 *   I=1 J=5 
 *   I=3 J=9 -> J - i -> 9 - 3 = 6
 *   I=3 J=8
 *   I=3 J=7
 *   ...
 *   I=9 J=15 -> J - i -> 15 - 9 = 6
 *   I=9 J=14
 *   I=9 J=13
 */


public class BEE_1097{

    public static void main(String[] args) {
        
        //in the output above i starts in 1 and finish in 9 adding two each time
        for (int i = 1; i <= 9; i+=2){
            
            //to find where j starts look at the similarity in each step  
            for(int j = 6 + i; j >= 4 + i ; j--){
                System.out.println("I="+ i + " J=" + j);
            }

        }

    }

}