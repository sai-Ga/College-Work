package gui7;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class NumberToWordsServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(6751); // Start RMI registry
            NumberToWordsService service = new NumberToWordsServiceImpl();
            Naming.rebind("rmi://localhost/NumberToWordsService", service);
            System.out.println("Number to Words Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
