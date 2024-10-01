package gui2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(3490); // Start RMI registry
            FactorialService service = new FactorialServiceImpl();
            Naming.rebind("rmi://localhost/FactorialService", service);
            System.out.println("Factorial Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
