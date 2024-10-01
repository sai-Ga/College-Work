package gui8;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReverseNumberService extends Remote {
    int reverseNumber(int number) throws RemoteException;
}
