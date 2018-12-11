import java.io.FileNotFoundException;

public class Main {
    static int totalBudgetRequired;
    static String currentPhase;
    static String currentTestedRocketType;
    static void println (){
    System.out.println("The total cost when using "+currentTestedRocketType+ "rockets in "+currentPhase+" is $ "+totalBudgetRequired+ "Million.");
    }
    public static void main(String[] args){
        Simulation simulation = new Simulation("phase1.txt");
        currentPhase = "phase 1";
        currentTestedRocketType = "U1";
        simulation.loadU1 ();
        simulation.runSimulation();
        totalBudgetRequired = simulation.totalBudgetRequired;
        println();

        simulation = new Simulation("phase2.txt");
        currentPhase = "phase 2";
        currentTestedRocketType = "U1";
        simulation.loadU1();
        simulation.runSimulation();
        totalBudgetRequired = simulation.totalBudgetRequired;
        println();

        simulation = new Simulation("phase1.txt");
        currentPhase = "phase 1";
        currentTestedRocketType = "U2";
        simulation.loadU2();
        simulation.runSimulation();
        totalBudgetRequired = simulation.totalBudgetRequired;
        println();

        simulation = new Simulation("phase2.txt");
        currentPhase = "phase 2";
        currentTestedRocketType = "U2";
        simulation.loadU2();
        simulation.runSimulation();
        totalBudgetRequired = simulation.totalBudgetRequired;
        println();
        }
    }

