package gui9;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GCDService extends Remote {
    int calculateGCD(int a, int b) throws RemoteException;
}
