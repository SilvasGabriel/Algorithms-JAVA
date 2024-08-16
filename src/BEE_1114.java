import java.util.Scanner;

/*
 * Fixed Password
 * 
 *  Write a program that keep reading a password until it is valid. For each wrong password read, write the message "Senha inválida". When the password is typed correctly print the message "Acesso Permitido" and finished the program. The correct password is the number 2002.
 *
 *   Input
 *   The input file contains several tests cases. Each test case contains only an integer number.
 *
 *   Output
 *  For each number read print a message corresponding to the description of the problem.
 * 
 *  Input Sample	  Output Sample
 *       2200           Senha Invalida
 *       1020           Senha Invalida
 *       2022           Senha Invalida
 *       2002           Acesso Permitido
 * 
 * 
 * 
 */


public class BEE_1114 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)){
            
            int value = read.nextInt();

              if(value == 2002){

                    System.out.println("Acesso Permitido");
                    
                    
                }else{
    
                    System.out.println("Senha Invalida");
                   
                }  

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}