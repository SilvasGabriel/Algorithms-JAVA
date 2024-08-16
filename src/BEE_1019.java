import java.util.Scanner;

/*
 * TIME CONVERSION
 * 
 * Read an integer value, which is the duration in seconds of a given event in a factory, 
 * and enter it expressed in the format hours:minutes:seconds.
 * 
 * INPUT
 * 
 * The input file contains an integer value.
 * 
 */

public class BEE_1019 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            int time_declared = read.nextInt();
            int hour = time_declared / 3600;
            int remaining_seconds = time_declared % 3600;
            int minutes = remaining_seconds / 60 ;
            int seconds = remaining_seconds % 60 ;
            
            System.out.println(hour+":"+minutes+":"+ seconds);
        }
    }

}