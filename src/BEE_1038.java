import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * LUNCH
 * 
 * With base on the table down, write a programm that read a code of one item and
 * the quantity of that item. Next calcule e show the value of the bill to pay.
 * 
 * CODIGO  ESPECIFICAÇÃO    PREÇO
    1       Cachorro Quente  R$ 4.00
    2       X-Salada         R$ 4.50
    3       X-Bacon          R$ 5.00
    4       Torrada simples  R$ 2.00
    5       Refrigerante     R$ 1.50
 * 
 * INPUT
 * 
 * The file contains two integer values corresponding to code and quantity of an item
 * according to the table above. 
 * 
 */

public class BEE_1038 {

    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            DecimalFormat two = new DecimalFormat("0.00");
            int code = read.nextInt();
            int quantity = read.nextInt();
            double value ;
            
            switch (code) {
                case 1 -> { 
                    value = quantity * 4.00;
                    System.out.println("Total : R$ "+ two.format(value));
                    break;
                }
                case 2 -> {
                    value = quantity * 4.50;
                    System.out.println("Total : R$ "+ two.format(value));
                    break;
                }
                case 3 -> {
                    value = quantity * 5.00;
                    System.out.println("Total : R$ "+ two.format(value));
                    break;
                }
                case 4 -> {
                    value = quantity * 2.00;
                    System.out.println("Total : R$ "+ two.format(value));
                    break;
                }
                case 5 -> {
                    value = quantity * 1.50;
                    System.out.println("Total : R$ "+ two.format(value));
                    break;
                }
                default -> {
                    break;
                }        
            }
        }
        
    }


    
}