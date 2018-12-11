public class U1 extends Rocket {

    int rocketCost = 100;


    public U1() {
        super.setTotalWeight(10000);
        super.setAllowedWeight(18000);
        super.setOwnWeight(10000);
    }

    public boolean launch() {
        boolean launchSucceeded = false;
        if (Math.random() > (0.05 * totalWeight / allowedWeight)) {
            launchSucceeded = true;
        }
            else {
                System.out.println("Oh no! Rocket crashed while launching.");
            }

    return launchSucceeded;
    }
    public boolean land() {
        boolean landSucceeded = false;
        if (Math.random() > (0.01 * totalWeight / allowedWeight)){
            landSucceeded = true;}
            else {
                System.out.println("Oh no! Rocket crashed while landing");
        }
        return landSucceeded;
    }

}

