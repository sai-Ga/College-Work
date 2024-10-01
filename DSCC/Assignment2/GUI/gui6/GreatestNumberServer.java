package gui6;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GreatestNumberServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1245); // Start RMI registry
            GreatestNumberService service = new GreatestNumberServiceImpl();
            Naming.rebind("rmi://localhost/GreatestNumberService", service);
            System.out.println("Greatest Number Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
