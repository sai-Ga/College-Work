package gui6;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GreatestNumberService extends Remote {
    int findGreatest(int a, int b) throws RemoteException;
}
