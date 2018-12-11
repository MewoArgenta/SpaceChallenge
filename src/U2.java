public class U2 extends  Rocket {

    int rocketCost = 120;

    public U2() {
        super.setTotalWeight(18000);
        super.setAllowedWeight(29000);
        super.setOwnWeight(18000);

    }

    public boolean launch() {
        boolean launchSucceeded = false;
        if (Math.random() > (0.04 * totalWeight / allowedWeight)) {
            launchSucceeded = true;
        }
        return launchSucceeded;
    }

    public boolean land() {
        boolean landSucceeded = false;
        if (Math.random() > (0.08 * totalWeight / allowedWeight)) {
            landSucceeded = true;
        }
        return landSucceeded;
    }

}