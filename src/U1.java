import java.lang.Math;

public class U1 extends Rocket {

    int cost = 100;
    private int rocketWeight = 10000;
    private int maxRocketWeight = 18000;

    private int launchExplosion = 5 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);
    private int landCrash = (maxRocketWeight - rocketWeight) / maxRocketWeight;

    public boolean launch() {
        return launchExplosion <= 100 * Math.random();
    }

    public boolean land() {
        return landCrash <= 100 * Math.random();
    }
}
