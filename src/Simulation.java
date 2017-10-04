import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class Simulation {

    ArrayList loadItems(String filename) throws Exception {
        // Reads every line in .txt file
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        ArrayList items = new ArrayList();
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

  /**  ArrayList loadU1(ArrayList items) {
        ArrayList rocketsU1 = new ArrayList();
        for (int i=0; i < items.size(); i++)
            rocketsU1.add(i);
        return rocketsU1;
    }

    ArrayList loadU2(ArrayList items) {
        ArrayList rocketsU2 = new ArrayList();
        return rocketsU2;

    }

    int runSimulation(ArrayList rockets) {
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
