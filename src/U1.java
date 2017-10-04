public class U1 extends Rocket {

    int cost = 100;
    int rocketWeight = 10;
    int maxRocketWeight = 18;


    private double launchExplosion = 0.05 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);
    private double landCrash = 0.01 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);

    public boolean launch() {
        return launchExplosion > 0.5;
    }

    public boolean land() {
        return landCrash > 0.5;
    }
}
