package timeservice;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TimeServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1020); // Start RMI registry
            TimeService timeService = new TimeServiceImpl();
            Naming.rebind("rmi://localhost/TimeService", timeService);
            System.out.println("Time Server is ready.");
        } catch (Exception e) {
            System.out.println("Time Server failed: " + e);
        }
    }
}
