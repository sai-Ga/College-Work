package eqn1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquationService extends Remote {
    double calculateEquation(int a, int b) throws RemoteException;
}

