import java.util.Scanner;

/*
 * SIX ODD NUMBERS
 * Read an integer value X. 
 * Then present the 6 consecutive odd values ​​starting from X, one value per line, including X if applicable.
 * 
 * INPUT 
 * The input will be a positive integer value.
 */

public class BEE_1070 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

          int number = read.nextInt();
         
          //function for detect if the start number is even, if is add plus one for him.
          if(number % 2 == 0){
            number = number + 1;
          }

          for (int i = 0; i < 6; i++) {
              System.out.println(number);
              //Inside of the for add plus 2 to the number because the next number is always Even,
              //so that tha number became odd.
              number = number + 2;
          }

        }

    }
    
}