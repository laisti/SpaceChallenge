import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class Simulation {

    ArrayList<Item> loadItems(String filename) throws Exception {
        // Reads every line in .txt file
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        ArrayList<Item> items = new ArrayList<Item>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("=");
            String name = parts[0];
            int weight = Integer.parseInt(parts[1]);
            Item item = new Item(name, weight);
            item.name = name;
            item.weight = weight;
            items.add(item);
        }
        return items;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> rocketsU1 = new ArrayList<Rocket>();
        for (int i = 0; i < items.size(); i++) {
            U1 u1 = new U1(100, 100000, 180000);
            while (u1.weight != u1.maxWeight) {
                if (u1.canCarry(items.get(i))) {
                    u1.carry(items.get(i));
                }
                else {
                    break;
                }
            }
            rocketsU1.add(u1);
        }
        System.out.println(rocketsU1);
        return rocketsU1;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> rocketsU2 = new ArrayList<Rocket>();
        U2 u2 = new U2(120, 180000, 290000);
        for (int i = 0; i < items.size(); i++) {
            if (u2.canCarry(items.get(i))) {
                u2.carry(items.get(i));
            }
        }
        rocketsU2.add(u2);
        System.out.println(rocketsU2);
        return rocketsU2;
    }

    /**int runSimulation(ArrayList rockets) {
        int totalBudget = 0;

        for (int r=0; r <= rockets.size(); r++) {
            boolean launch = rockets.get(r).launch();
            boolean land = rockets.get(r).land();
            totalBudget *= r;
            while (!launch || !land) {
                rockets.get(r).launch();
                totalBudget *= r;
            }
        }
        return totalBudget;
    } */
}
