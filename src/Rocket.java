public class Rocket implements SpaceShip {

    int weight;
    int maxWeight;

    Rocket(int rocketWeight, int maxRocketWeight) {
        weight = rocketWeight;
        maxWeight = maxRocketWeight;
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public final boolean canCarry(Item item) {
        return item.weight <= maxWeight - weight;
    }

    public final int carry(Item item) {
        if (canCarry(item)) {
            weight += item.weight;
        }
        return weight;
    };
}
