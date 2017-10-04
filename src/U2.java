public class U2 extends Rocket {

    int cost = 120;
    private int rocketWeight = 18;
    private int maxRocketWeight = 29;

    private double launchExplosion = 0.05 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);
    private double landCrash = 0.01 * ((maxRocketWeight - rocketWeight) / maxRocketWeight);

    public boolean launch() {
        return launchExplosion > 0.5;
    }

    public boolean land() {
        return landCrash > 0.5;
    }
}
