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
            Item item = new Item();
            item.name = name;
            item.weight = weight;
            items.add(item);
        }
        System.out.println(items);
        return items;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> rocketsU1 = new ArrayList<Rocket>();
        U1 u1 = new U1();
        for (Item item: items) {
            if (u1.canCarry(item)) {
                u1.carry(item);
            } else {
                U1 u2 = new U1();
            }
        }
        rocketsU1.add(u1);
        return rocketsU1;
    }

    ArrayList loadU2(ArrayList items) {
        ArrayList rocketsU2 = new ArrayList();
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
