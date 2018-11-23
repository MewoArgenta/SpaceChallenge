import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
public class ItemphasesToStacks {
    int numberOfItemsPhase1 = 0;
    Stack nameItemsPhase1 = new Stack();
    Stack weightItemsPhase1 = new Stack();
    //int lengthStackPhase2 =0;


// put items from phase 1 into a stack
    public void phase1ToStack() throws FileNotFoundException {
        File file = new File("phase1.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] parts = line.split("=");
            String line1 = parts [0];
            String line2 = parts [1];
            nameItemsPhase1.push(line1);
            weightItemsPhase1.push(line2);
            numberOfItemsPhase1 += 1;
        }
    }

    /*has to be like phase 1 will make it when phase 1 works
    public Stack phase2ToStack() throws FileNotFoundException {
        File file = new File("phase1.txt");
        Scanner scanner = new Scanner(file);
        Stack itemsPhase2 = new Stack();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] parts = line.split("=");
            String line1 = parts [0];
            String line2 = parts [1];
            itemsPhase2.push(line1);
            itemsPhase2.push(line2);
            lengthStackPhase2 += 2;
        }
        return itemsPhase2;
    }
    */

}
