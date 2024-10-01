package eqn3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class QuadraticEquationServiceImpl extends UnicastRemoteObject implements QuadraticEquationService {
    protected QuadraticEquationServiceImpl() throws RemoteException { }

    @Override
    public double[] solveQuadraticEquation(int a, int b, int c) throws RemoteException {
        double[] roots = new double[2];
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            throw new RemoteException("No real roots.");
        }

        roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a); // First root
        roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a); // Second root

        return roots;
    }
}
