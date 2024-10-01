package eqn2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquationService extends Remote {
    double calculateSumSquare(int a, int b) throws RemoteException;
    double calculateDifferenceSquare(int a, int b) throws RemoteException;
}

