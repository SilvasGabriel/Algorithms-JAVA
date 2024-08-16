import java.util.Scanner;

/*
 * DIFFERENCE
 * Read four integer values A,B,C,D.
 * Next calculate the difference of the product of A and B pelo product of C and D.
 * Use the formula DIFFERENCE = (A*B-C*D).
 * 
 * INPUT 
 * The file contain four integer values.
 * 
 */


public class BEE_1007{

    public static void main(String[] args) {
        

        try (Scanner read = new Scanner(System.in)) {
            int A = read.nextInt();
            int B = read.nextInt();
            int C = read.nextInt();
            int D = read.nextInt();
            int difference = ((A * B)-(C * D));  
            System.out.println("DIFERENCA = "+ difference);
        }

    }

}