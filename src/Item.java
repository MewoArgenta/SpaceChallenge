import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;


//make stack of the items phase 1
public class Item {

    public Stack phase1ToStack() throws FileNotFoundException {
        File file = new File("phase1.txt");
        Scanner scanner = new Scanner(file);
        Stack itemsPhase1 = new Stack();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            itemsPhase1.push(line);
        }
        return itemsPhase1;
    }

    //make stack of items phase 2
    public Stack phase2ToStack() throws FileNotFoundException {
        File file = new File("phase1.txt");
        Scanner scanner = new Scanner(file);
        Stack itemsPhase2 = new Stack();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            itemsPhase2.push(line);
        }
        return itemsPhase2;
    }
}
