import java.util.Scanner;

/**
 * CPF Input and Output
 * 
 * Your teacher would like to make a program with the following characteristics:
 *  
 *  1.Read the data of a CPF in the format XXX.YYY.ZZZ-DD;
 *  2.Print the four numbers, one value per line.
 * 
 * Input
 * 
 * The entry consists of several test files. In each test file there is one line. The line has the following format XXX.YYY.ZZZ-DD, where XXX, YYY, ZZZ, DD are integers. As shown in the following input example.
 * 
 * Output
 * 
 * For each file in the entry, you have an output file. The output file has four rows with an integer in each of them as it has been entered. As shown in the following output example.
 * 
 *      Input Samples	        Output Samples
 *       000.000.000-00             000
 *                                  000
 *                                  000
 *                                  00
 * 
 *      320.025.102-01              320
 *                                  025
 *                                  102
 *                                  01
 * 
 */
public class BEE_2763 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            System.out.println("\n");

            String CPF = read.nextLine();
            String xthree =  CPF.substring(0, 3);
            String ythree = CPF.substring(4, 7);
            String zthree = CPF.substring(8, 11);
            String dtwo = CPF.substring(12, 14);

            System.out.println("\n");
            System.out.println(xthree);
            System.out.println(ythree);
            System.out.println(zthree);
            System.out.println(dtwo);

        } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
        }
    }
}