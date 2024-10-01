package eqn4;

import java.rmi.Naming;
import java.util.Scanner;

public class PowerClient {
    public static void main(String[] args) {
        try {
            PowerService service = (PowerService) Naming.lookup("rmi://localhost/PowerService");
            
            @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for Y: ");
            double Y = scanner.nextDouble();
            System.out.print("Enter value for n: ");
            int n = scanner.nextInt();
            
            double result = service.calculatePower(Y, n);
            
            System.out.println("Result of Y^n: " + result);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
