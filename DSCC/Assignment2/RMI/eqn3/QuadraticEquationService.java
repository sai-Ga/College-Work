package eqn3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QuadraticEquationService extends Remote {
    double[] solveQuadraticEquation(int a, int b, int c) throws RemoteException;
}

