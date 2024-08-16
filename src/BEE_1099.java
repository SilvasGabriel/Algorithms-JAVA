import java.util.Scanner;

/*
 *  Sum of Consecutive Odd Numbers II
 * 
 *  Read an integer N that is the number of test cases. Each test case is a line containing two integer numbers X and Y. Print the sum of all odd values between them, not including X and Y.
 *
 *   Input
 *  The first line of input is an integer N that is the number of test cases that follow. Each test case is a line containing two integer X and Y.
 *
 *   Output
 *  Print the sum of all odd numbers between X and Y.
 *  
 *  Input Sample	Output Sample
 *       7                   
 *
 *       4 5                 0
 *
 *       13 10               11
 *
 *       6 4                 5
 *
 *       3 3                 0
 *
 *       3 5                 0
 *
 *       3 4                 0
 *
 *       3 8                 12
 * 
 */


public class BEE_1099{

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){

            //Quantity of tests
            int N = read.nextInt();

            //Loop to check the quantity of tests
            for (int i = 0; i < N; i++) {
                //Variable to allocate the sum
                int sum = 0;

                //Two variables to save the values and ask the sum between odds
                int X = read.nextInt();
                int Y = read.nextInt();

                //Check when X is minor than Y, loop starts with x+1 because he cant start withself
                //and inside one conditional checking the odd numbers
                if(X < Y){
                    for(int j = X + 1; j < Y; j++){
                        if(j%2 != 0){
                            sum = sum + j;
                        }
                    }
                }else{
                    for (int j = Y + 1; j < X ; j++){
                        if(j%2 != 0){
                            sum = sum + j;
                        }
                    }
                }

                System.out.println(sum);  

            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}