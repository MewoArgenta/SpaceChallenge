import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
public class Simulation {

    Stack<U1> u1Rockets = new Stack();
    Stack<U2> u2Rockets = new Stack();
    public int totalBudgetRequiredU1 = 0;
    public int totalBudgetRequiredU2 = 0;


    // put items into a stack
    static Stack <Item> items;

    {
        try {
            items = loadItems();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }










    public Stack loadItems() throws FileNotFoundException {
        Stack<Item> items = new Stack();
        File file = new File("phase1.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] parts = line.split("=");
            String line1 = parts [0];
            String line2 = parts [1];
            int line2Int = Integer.parseInt(line2);

            Item toSave = new Item();
            toSave.setName(line1);
            toSave.setWeight(line2Int);

            items.push(toSave);
        }

        file = new File("phase2.txt");
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] parts = line.split("=");
            String line1 = parts [0];
            String line2 = parts [1];
            int line2Int = Integer.parseInt(line2);

            Item toSave = new Item();
            toSave.setName(line1);
            toSave.setWeight(line2Int);

            items.push(toSave);
        }
        return items;
    }



    public void loadU1() {
        while (items.size() > 0){
        U1 u1ToSave = new U1();
        while (u1ToSave.canCarryItem()) {
            u1ToSave.carry();
            if (items.size() == 0){break;}
        }
            u1Rockets.push(u1ToSave);
            }

        }

    public void loadU2() {
        while (items.size() > 0){
            U2 u2ToSave = new U2();
            while (u2ToSave.canCarryItem()) {
                u2ToSave.carry();
                if (items.size() == 0){break;}
            }

            u2Rockets.push(u2ToSave);


        }

    }

    public void runSimulation(){
        while (u1Rockets.size()>0) {
            U1 peekedU1 = u1Rockets.peek();
            totalBudgetRequiredU1 += peekedU1.rocketCost;
            if (peekedU1.launch() && peekedU1.land()){
                U1 poppedU1 = u1Rockets.pop();

            }
        }
        while (u2Rockets.size()>0) {
            U2 peekedU2 = u2Rockets.peek();
            totalBudgetRequiredU2 += peekedU2.rocketCost;
            if (peekedU2.launch() && peekedU2.land()){
                U2 poppedU1 = u2Rockets.pop();

            }
        }



    }

    }
