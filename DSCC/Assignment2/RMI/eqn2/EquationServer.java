package eqn2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class EquationServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(9080); // Start RMI registry
            EquationService service = new EquationServiceImpl();
            Naming.rebind("rmi://localhost/EquationService", service);
            System.out.println("Equation Server is ready.");
        } catch (Exception e) {
            System.out.println("Equation Server failed: " + e);
        }
    }
}
