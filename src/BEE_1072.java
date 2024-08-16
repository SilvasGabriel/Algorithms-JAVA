import java.util.Scanner;

/*
 *  Interval Two
 *
 *
 *  Read an integer value N. This value will be the number of integer values ​​X that will be read next.
 *  Show how many of these X values ​​are within the range [10,20] and how many are outside the range by showing this information.
 *
 *  Entry
 *  The first line of the input contains an integer value N (N < 10000), which indicates the number of test cases.
 *  Each test case below is an integer value X (-107 < X < 107).
 *
 *
 *  Exit
 *  For each case, print how many numbers are in and how many values ​​are out of the range.
 * 
 */

public class BEE_1072 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            int in = 0;
            int out = 0;

            //Quantity of numbers to read
            int N = read.nextInt();

           for (int i = 0; i < N; i++) {
                
               // Numbers that will be readed
               int numbers = read.nextInt();
               if(numbers >= 10 && numbers <= 20){
                    in++;
               }else{
                    out++;
               }
           }

            System.out.println(in + " in ");
            System.out.println(out + " out ");
                 
    
        }

    }

}