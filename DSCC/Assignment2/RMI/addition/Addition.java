package addition;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class Addition extends UnicastRemoteObject implements AdditionInterface {
    public Addition() throws RemoteException { }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
