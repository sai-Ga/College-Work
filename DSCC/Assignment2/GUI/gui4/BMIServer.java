package gui4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BMIServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(7658); // Start RMI registry
            BMICalculator service = new BMICalculatorImpl();
            Naming.rebind("rmi://localhost/BMICalculatorService", service);
            System.out.println("BMI Calculator Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
