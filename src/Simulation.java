import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Simulation {

    public ArrayList loadItems(String filename) {
        // Reads every line in .txt file
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        ArrayList items = new ArrayList();
        while (line != null) {
            String[] parts = line.split("=");
            String name = parts[0];
            int weight = Integer.parseInt(parts[1]);
            Item item = new Item();
            item.name = name;
            item.weight = weight;
            items.add(item);
        }
        return items;
    }

    public ArrayList loadU1(ArrayList items) {
        ArrayList rocketsU1 = new ArrayList();
        for (int i=0; i < items.size(); i++)
            rocketsU1.add(i);
        return rocketsU1;
    }

    public ArrayList loadU2(ArrayList items) {
        ArrayList rocketsU2 = new ArrayList();
        return rocketsU2;

    }

    public int runSimulation(ArrayList rockets) {
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
    }
}
