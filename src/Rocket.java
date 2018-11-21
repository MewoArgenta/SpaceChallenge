public class Rocket implements Spaceship {

    /*indicates if the launch was succesful or not
    returns true and is overwritten by U1/U2 class
     */
    public boolean launch(){
        return true;
    }

    /*indicates if the launch was succesful or not
    returns true and is overwritten by U1/U2 class
     */
    public boolean land(){
        return true;
    }

    /* a method that takes an Item as an argument and returns true
   if the rocket can carry such item or false if it will exceed the weight limit.
    */
    public boolean canCarryItem(){
        int totalWeight = 0;
        int allowedWeight = 0;
        int item = 0;
        boolean canCarryItem =false;
        if ((item + totalWeight) < allowedWeight) {
            canCarryItem = true;
        }
        return canCarryItem;
    }


    /* a method that also takes an Item object
    and updates the current weight of the rocket.
     */
    public int carry(){
        int addedWeight = 0;
        int weight = 0;
        boolean canCarryItem = canCarryItem();
        if (canCarryItem = true){ addedWeight = weight;
        }
        return addedWeight;
    }

}