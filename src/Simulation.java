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
        int i = 0;

        while (i < items.size()) {
            U1 u1 = new U1(100, 100000, 180000);
            while (u1.canCarry(items.get(i))) {
                u1.carry(items.get(i));
                i++;
                if (i == items.size()) {
                    break;
                }
            }
            rocketsU1.add(u1);
        }
        return rocketsU1;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> rocketsU2 = new ArrayList<Rocket>();
        int i = 0;

        while (i < items.size()) {
            U2 u2 = new U2(120, 180000, 290000);
            while (u2.canCarry(items.get(i))) {
                u2.carry(items.get(i));
                i++;
                if (i == items.size()) {
                    break;
                }
            }
            rocketsU2.add(u2);
        }
        return rocketsU2;
    }

    int runSimulation(ArrayList<Rocket> rockets) {
        int totalBudget = 0;
        int count = 0;

        for (Rocket r: rockets) {
            boolean launch = r.launch();
            boolean land = r.land();
            if (r.land()) {
                launch = true;
            }
            else {
                land = false;
            }

            while (!launch || !land) {
                count++;
                totalBudget += r.cost;
                launch = r.launch();
                land = r.land();
            }

            if (launch && land) {
                    count++;
                    totalBudget += r.cost;
            }
        }
        return totalBudget;
    }
}
