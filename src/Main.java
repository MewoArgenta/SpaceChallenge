import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        Simulation simulation = new Simulation();
        simulation.loadU1();
        simulation.runSimulation();
        System.out.println("The total cost when using U1 Rockets is $ " + simulation.totalBudgetRequiredU1+ "Million.");
        simulation = new Simulation();
        simulation.loadU2();
        simulation.runSimulation();
        System.out.println("The total cost when using U2 Rockets is $ " + simulation.totalBudgetRequiredU2+ "Million.");
        }
    }

