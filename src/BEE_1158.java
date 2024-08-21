import java.util.Scanner;

/*
 * Sum of Consecutive Odd Numbers III
 * 
 *  Read an integer N that is the number of test cases that follows. Each test case contains two integers X and Y. Print one output line for each test case that is the sum of Y odd numbers from X including it if is the case. For example:
    for the input 4 5, the output must be 45, that is: 5 + 7 + 9 + 11 + 13
 *  for the input 7 4, the output must be 40, that is: 7 + 9 + 11 + 13
 * 
 *  Input
 *   
 *  The first line of the input is an integer N that is the number of test cases that follow. Each test case is a line containing two integer X and Y.
 * 
 *  Output
 *   
 *  Print the sum of all consecutive odd numbers from X.
 * 
 * 
 *  Input Sample	Output Sample
 *       2                21  
 *       4 3              24
 *       11 2
 * 
 */
public class BEE_1158 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            int N = read.nextInt();
           
            for (int i = 0; i < N; i++) {
                
                int X = read.nextInt();
                int Y = read.nextInt();

                //Check the logic if the number at the start is even
                if(X % 2 == 0){
                    
                    X = X + 1;

                }
                int sum = 0;
                int currentNumber = X;

                for (int j = 0; j < Y; j++) {

                    sum = sum + currentNumber;
                    //Add +2 at X, because if it was 1 the next would be even.
                    currentNumber = currentNumber + 2;
                }

                System.out.println(sum);
            
            }
       
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}