/*
 * 
 * EVEN NUMBERS
 * 
 * Write a program that displays even numbers between 1 and 100, inclusive.
 * 
 * INPUT
 * 
 * In this extremely simple repetition problem there is no input.
 * 
 */

public class BEE_1059 {

    public static void main(String[] args) {

        for(int i = 0; i <= 100 ; i++){

            if(i % 2 == 0){
               System.out.println(i);
            }

        }

    }
    
}