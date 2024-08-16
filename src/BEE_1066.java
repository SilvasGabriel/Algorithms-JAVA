import java.util.Scanner;

/*
 * EVEN,ODD,POSITIVE AND NEGATIVE
 * Read 5 Integer values. 
 * Next, show how many values ​​entered were even, how many values ​​entered were odd
 * , how many values ​​entered were positive and how many values ​​entered were negative.
 * 
 * INPUT
 * The file contains any five integer values. 
 * 
 */

public class BEE_1066 {

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            int [] values = new int[5];
            int countPar = 0;
            int countImpar = 0;
            int countPositive = 0;
            int countNegative = 0;

            for (int i = 0; i < values.length ; i++) {
                values[i] = read.nextInt();
                
                    if(values[i] % 2 == 0){
                        countPar = countPar + 1;
                    }else{
                        countImpar = countImpar + 1;
                    }
                    
                    if(values[i] > 0){
                        countPositive = countPositive + 1;
                    }else if(values[i] < 0){
                        countNegative = countNegative + 1;
                    }

                 
                }
                
                System.out.println(countPar+" valor(es) par(es)");
                System.out.println(countImpar+" valor(es) impar(es)");
                System.out.println(countPositive+" valor(es) positivo(s)");
                System.out.println(countNegative+" valor(es) negativo(s)");
            
            }

        }

}

