package eqn4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PowerService extends Remote {
    double calculatePower(double Y, int n) throws RemoteException;
}
