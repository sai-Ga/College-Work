package eqn3;

import java.rmi.Naming;
import java.util.Scanner;

public class QuadraticEquationClient {
    public static void main(String[] args) {
        try {
            QuadraticEquationService service = (QuadraticEquationService) Naming.lookup("rmi://localhost/QuadraticEquationService");
            
            @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();
            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();
            System.out.print("Enter value for c: ");
            int c = scanner.nextInt();
            
            double[] roots = service.solveQuadraticEquation(a, b, c);
            
            System.out.println("Roots of the equation are: ");
            System.out.println("x1 = " + roots[0]);
            System.out.println("x2 = " + roots[1]);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}

