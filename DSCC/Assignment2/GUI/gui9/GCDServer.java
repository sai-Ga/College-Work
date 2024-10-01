package gui9;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GCDServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(7819); // Start RMI registry
            GCDService service = new GCDServiceImpl();
            Naming.rebind("rmi://localhost/GCDService", service);
            System.out.println("GCD Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
