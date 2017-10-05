public class Rocket implements SpaceShip {

    private int rocketWeight;
    private int maxRocketWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public final boolean canCarry(Item item) {
        return item.weight <= maxRocketWeight - rocketWeight;
    }

    public final int carry(Item item) {
        if (canCarry(item)) {
            rocketWeight += item.weight;
        }
        return rocketWeight;
    };
}
