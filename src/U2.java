import java.lang.Math;

public class U2 extends Rocket {

    int cost = 120;
    private int rocketWeight = 18000;
    private int maxRocketWeight = 29000;

    private int launchExplosion = 4 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);
    private int landCrash = 8 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);

    public boolean launch() {
        return launchExplosion <= 100 * Math.random();
    }

    public boolean land() {
        return landCrash <= 100 * Math.random();
    }
}
