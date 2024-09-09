/**
 * Output 6 
 * 
 * Your teacher would like you to do a program with the following characteristics:
 * 
 *  1.Create a variable to store 50 characters;
 *  2.Assign the variable before the phrase: "AMO FAZER EXERCICIO NO URI";
 *  3.Show in the first line the <character, the value stored in the variable with the format "% s" and the character>;
 *  4.Show in the next line the character <, the value stored in the variable with the format "% 30s" and the character>;
 *  5.Show in the next line the <, the value stored in the variable with the format "% .20s" and the character>;
 *  6.Show in the following line the <character, the value stored in the variable with the format "% -20s" and the character>;
 *  7.Show in the next line the <character, the value stored in the variable with the format "% -30s" and the character>;
 *  8.Show in the next line the <character, the value stored in the variable with the format "% .30s" and the character>;
 *  9.Show in the next line the <character, the value stored in the variable with the format "% 30.20s" and the character>;
 *  10.Show in the next line the <character, the value stored in the variable with the format "% -30.20s" and the character>;
 * 
 * Input
 * 
 * There is not.
 * 
 * Output
 * 
 * The result of your program should be written according to the output example.
 * 
 * Input Sample	                        Output Sample
 *                               <AMO FAZER EXERCICIO NO URI>
 *                               <    AMO FAZER EXERCICIO NO URI>
 *                               <AMO FAZER EXERCICIO >
 *                               <AMO FAZER EXERCICIO NO URI>
 *                               <AMO FAZER EXERCICIO NO URI    >
 *                               <AMO FAZER EXERCICIO NO URI>
 *                               <          AMO FAZER EXERCICIO >
 *                               <AMO FAZER EXERCICIO           >
 * 
 * 
 */
public class BEE_2752 {

    public static void main(String[] args) {
        String iLoveUri = "AMO FAZER EXERCICIO NO URI";
        
        //you can format tables just using the printf not the println

        System.out.printf("<%s>\n",iLoveUri);
        System.out.printf("<%30s>\n",iLoveUri);
        System.out.printf("<%.20s>\n",iLoveUri);
        System.out.printf("<%-20s>\n",iLoveUri);
        System.out.printf("<%-30s>\n", iLoveUri);
        System.out.printf("<%.30s>\n",iLoveUri);
        System.out.printf("<%30.20s>\n",iLoveUri);
        System.out.printf("<%-30.20s>\n",iLoveUri);

       
    }
}