import java.util.Scanner;
/*
 *  Closing Tabs
 * 
 *    Péricles has an unique interest in history. With his up-to-date internet browser chromed fox, he wandered in the most obscure sites about ancient Greek mythology.
 *
 *    By some type of cosmic irony, Péricles' browser was infected by a malware with a peculiar characteristic: every time Péricles closed a tab in his browser, another two opened! However, when Péricles clicked one of the ads (all tabs were infested with ads), the tab crashed, and no other tabs were opened.
 *
 *    Your taks is to compute the final number of tabs of Péricles's browser, knowing the initial number of tabs and the actions taken by Péricles. There are two possible actions: fechou (when Péricles closed a tab) and clicou (when Péricles clicked on an ad).
 *
 *    Input
 *    
 *    The input is initiated by a line containing two integer numbers, N and M (0 < N, M < 500), representing the initial number of tabs and the number of actions performed by Péricles. Each subsequent line contains an action (fechou or clicou). Naturally, the current number of tabs is always greater or equal to zero.
 *
 *    Output
 *    
 *    The output must consist of a line containing the final number of tabs.
 * 
 * 
 *  Input Sample	Output Sample
 *      3 5               2
 *      fechou
 *      fechou
 *      clicou
 *      clicou
 *      clicou
 *
 *
 * 
 */
public class BEE_2061 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            
            int numberOfTabs = read.nextInt();
            int numberOfActions = read.nextInt();

            int Tabs = numberOfTabs;

            for (int i = 0; i < numberOfActions + 1; i++) {
                
                String value = read.nextLine();

                if(value.equals("fechou")){
                    Tabs = Tabs + 1;
                }else if (value.equals("clicou")) {
                    Tabs = Tabs - 1;
                }
            }

            System.out.println(Tabs);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}