package gui3;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TemperatureServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(2342); // Start RMI registry
            TemperatureConverter service = new TemperatureConverterImpl();
            Naming.rebind("rmi://localhost/TemperatureService", service);
            System.out.println("Temperature Conversion Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
