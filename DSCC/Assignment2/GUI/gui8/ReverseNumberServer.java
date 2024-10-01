package gui8;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ReverseNumberServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(8712); // Start RMI registry
            ReverseNumberService service = new ReverseNumberServiceImpl();
            Naming.rebind("rmi://localhost/ReverseNumberService", service);
            System.out.println("Reverse Number Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
