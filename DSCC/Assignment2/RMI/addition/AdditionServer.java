package addition;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AdditionServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start RMI registry
            Addition addition = new Addition();
            Naming.rebind("rmi://localhost/AdditionService", addition);
            System.out.println("Addition Server is ready.");
        } catch (Exception e) {
            System.out.println("Addition Server failed: " + e);
        }
    }
}
