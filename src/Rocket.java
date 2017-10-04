public class Rocket implements SpaceShip {

    int cost;
    int rocketWeight;
    int maxRocketWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public final boolean canCarry(Item item) {
        return item.weight <= maxRocketWeight;
    }

    public final int carry(Item item) {
        if (canCarry(item)) {
            rocketWeight += item.weight;
        }
        return rocketWeight;
    };
}
