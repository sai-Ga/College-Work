package eqn4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class PowerServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(3466); // Start RMI registry
            PowerService service = new PowerServiceImpl();
            Naming.rebind("rmi://localhost/PowerService", service);
            System.out.println("Power Server is ready.");
        } catch (Exception e) {
            System.out.println("Power Server failed: " + e);
        }
    }
}

