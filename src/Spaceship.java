public interface Spaceship {



    /* method that returns true or false
    indicating if the launch was succesful or not
     */
    boolean launch();




    /* method that returns true or false
    indicating if the land was succesful or not
     */
    boolean land();




    /* a method that takes an Item as an argument and returns true
    if the rocket can carry such item or false if it will exceed the weight limit.
     */
    boolean canCarryItem();




    /* a method that also takes an Item object
    and updates the current weight of the rocket.
     */
    int carry();



}
