package gui1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AdditionServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start RMI registry
            AdditionService service = new AdditionServiceImpl();
            Naming.rebind("AdditionService", service);
            System.out.println("Addition Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
