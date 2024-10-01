package eqn2;

import java.rmi.Naming;
import java.util.Scanner;

public class EquationClient {
    public static void main(String[] args) {
        try {
            EquationService service = (EquationService) Naming.lookup("rmi://localhost/EquationService");
            
            @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();
            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();
            
            double sumSquare = service.calculateSumSquare(a, b);
            double differenceSquare = service.calculateDifferenceSquare(a, b);
            
            System.out.println("Result of (a + b)^2: " + sumSquare);
            System.out.println("Result of (a - b)^2: " + differenceSquare);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
