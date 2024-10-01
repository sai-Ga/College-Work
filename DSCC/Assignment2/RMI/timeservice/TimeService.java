package timeservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeService extends Remote {
    String getCurrentTime() throws RemoteException;
}

