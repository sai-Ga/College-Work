package addition;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AdditionInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}
