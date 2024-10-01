package eqn3;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class QuadraticEquationServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(4567); // Start RMI registry
            QuadraticEquationService service = new QuadraticEquationServiceImpl();
            Naming.rebind("rmi://localhost/QuadraticEquationService", service);
            System.out.println("Quadratic Equation Server is ready.");
        } catch (Exception e) {
            System.out.println("Quadratic Equation Server failed: " + e);
        }
    }
}


