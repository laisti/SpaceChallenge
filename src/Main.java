import java.util.ArrayList;

public class Main {
    public static void main(String [] args)  throws Exception {
        Simulation simulation = new Simulation();

        ArrayList phase1 = simulation.loadItems("phase-1.txt");
        ArrayList phase2 = simulation.loadItems("phase-2.txt");

        /** // U1 rockets
        ArrayList phase1RocketsU1 = simulation.loadU1(phase1);
        ArrayList phase2RocketsU1 = simulation.loadU1(phase2);

        int totalBudgetPhase1U1 = simulation.runSimulation(phase1RocketsU1);
        int totalBudgetPhase2U1 = simulation.runSimulation(phase2RocketsU1);
        int totalBudgetU1 = totalBudgetPhase1U1 + totalBudgetPhase2U1;

        System.out.println(totalBudgetU1);

        // U2 rockets
        ArrayList phase1RocketsU2 = simulation.loadU2(phase1);
        ArrayList phase2RocketsU2 = simulation.loadU2(phase2);

        int totalBudgetPhase1U2 = simulation.runSimulation(phase1RocketsU2);
        int totalBudgetPhase2U2 = simulation.runSimulation(phase2RocketsU2);
        int totalBudgetU2 = totalBudgetPhase1U2 + totalBudgetPhase2U2;

        System.out.println(totalBudgetU2); */
    }
}
