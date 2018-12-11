import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
public class Simulation {

    Stack <U1> u1Rockets;
    Stack <U2> u2Rockets;
    public int totalBudgetRequired = 0;
    String pathname;
    Scanner scanner;


    // put items into a stack
    static Stack <Item> items;

public Simulation (String pathname) {
        u1Rockets = new Stack();
        u2Rockets = new Stack();
    File file = new File(pathname);
    try {
        scanner = new Scanner(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    loadItems();
}








    public Stack loadItems()  {
        items = new Stack();
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
        while (items.size() > 0) {
            U1 u1ToSave =new U1();
            while (u1ToSave.canCarryItem()) {
                u1ToSave.carry();
                if (items.size() == 0) {
                    break;
                }

                u1Rockets.push(u1ToSave);

            }
        }
    }

    public void loadU2() {
        while (items.size() > 0){
            U2 u2ToSave = new U2();
            while (u2ToSave.canCarryItem()) {
                u2ToSave.carry();
                if (items.size() == 0){
                    break;}
            }

            u2Rockets.push(u2ToSave);


        }

    }

    public void runSimulation(){
        while (u1Rockets.size()>0) {
            U1 peekedU1 = u1Rockets.peek();
            totalBudgetRequired += peekedU1.rocketCost;
            if (peekedU1.launch() && peekedU1.land()){
                U1 poppedU1 = u1Rockets.pop();

            }
        }
        while (u2Rockets.size()>0) {
            U2 peekedU2 = u2Rockets.peek();
            totalBudgetRequired += peekedU2.rocketCost;
            if (peekedU2.launch() && peekedU2.land()){
                U2 poppedU1 = u2Rockets.pop();

            }
        }



    }

    }
