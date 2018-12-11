import java.io.FileNotFoundException;
import java.util.Stack;

public class Rocket implements Spaceship {




    //ownweight + weight loaded items
    public int totalWeight;
    //weight of the rocket
    public int ownWeight;
    //maximum weight a rocket can have
    public int allowedWeight;




    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setOwnWeight(int ownWeight) {
        this.ownWeight = ownWeight;
    }

    public void setAllowedWeight(int allowedWeight) {
        this.allowedWeight = allowedWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getOwnWeight() {
        return ownWeight;
    }

    public int getAllowedWeight() {
        return allowedWeight;
    }


    /*indicates if the launch was succesful or not
    returns true and is overwritten by U1/U2 class
     */
    public boolean launch() {
        return true;
    }

    /*indicates if the launch was succesful or not
    returns true and is overwritten by U1/U2 class
     */
    public boolean land() {
        return true;
    }

    /* a method that takes an Item as an argument and returns true
   if the rocket can carry such item or false if it will exceed the weight limit.
    */
    public boolean canCarryItem() {
        //check the first item without removing it from the stack
        Item peekedItem = Simulation.items.peek();
        int weightItem = peekedItem.getWeight();
        boolean canCarryItem = false;
        if ((weightItem + totalWeight) <= allowedWeight) {
            canCarryItem = true;
        }
        return canCarryItem;
    }


    /* a method that also takes an Item object
    and updates the current weight of the rocket.
     */
    public void carry() {
        Item poppedItem = Simulation.items.pop();
        int weightItem = poppedItem.getWeight();
        totalWeight += totalWeight + weightItem;
            }

}
