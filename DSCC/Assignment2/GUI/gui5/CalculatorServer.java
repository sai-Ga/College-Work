package gui5;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Create and export the registry on port 5060
            LocateRegistry.createRegistry(5060);
            CalculatorImpl ci = new CalculatorImpl();
            Naming.rebind("//localhost:5060/CalculatorServer", ci);
            System.out.println("Calculator Server is ready on port 5060");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

