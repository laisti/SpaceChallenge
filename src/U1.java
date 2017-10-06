import java.lang.Math;

public class U1 extends Rocket {

    private int rocketCost;

    U1(int cost, int rocketWeight, int maxRocketWeight){
        super(rocketWeight, maxRocketWeight);
        rocketCost = cost;
    }

    private int launchExplosion = 5 * ((maxWeight - weight) / maxWeight);
    private int landCrash = (maxWeight - weight) / maxWeight;

    public boolean launch() {
        return launchExplosion <= 100 * Math.random();
    }

    public boolean land() {
        return landCrash <= 100 * Math.random();
    }
}
