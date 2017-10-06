import java.lang.Math;

public class U2 extends Rocket {

    private int rocketCost;

    U2(int cost, int rocketWeight, int maxRocketWeight){
        super(rocketWeight, maxRocketWeight);
        rocketCost = cost;
    }

    private int launchExplosion = 4 * ((maxWeight - weight) / maxWeight);
    private int landCrash = 8 * (maxWeight - weight) / maxWeight;

    public boolean launch() {
        return launchExplosion <= 100 * Math.random();
    }

    public boolean land() {
        return landCrash <= 100 * Math.random();
    }
}
